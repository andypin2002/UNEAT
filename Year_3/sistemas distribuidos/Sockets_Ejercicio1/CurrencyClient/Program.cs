using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace CurrencyClient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            TcpClient tcpClient = new TcpClient("127.0.0.1", 13000);
            NetworkStream networkstream = tcpClient.GetStream();

            XmlDocument conversion = requestConversion("USD", "EUR", "10");

            byte[] bytesMessage = Encoding.ASCII.GetBytes(conversion.InnerXml);
            networkstream.Write(bytesMessage, 0, bytesMessage.Length);

            byte[] bytesRespuesta = new byte[256];
            int numBytesRespuesta = networkstream.Read(bytesRespuesta, 0, bytesRespuesta.Length);
            string Respuesta = Encoding.ASCII.GetString(bytesRespuesta);
            Console.WriteLine("RESPUESTA RECIBIDA EN CLIENTE: " + Respuesta);

            Console.ReadLine();
        }

        public static XmlDocument requestConversion(string from, string to, string units) {
            XmlDocument documento = new XmlDocument();

            XmlNode convertNode = documento.CreateElement("ConvertRequest");
            documento.AppendChild(convertNode);

            XmlNode nodeFrom = documento.CreateElement("from");
            nodeFrom.InnerText = from;
            convertNode.AppendChild(nodeFrom);

            XmlNode toNode = documento.CreateElement("to");
            toNode.InnerText = to;
            convertNode.AppendChild(toNode);

            XmlNode unitsNode = documento.CreateElement("units");
            unitsNode.InnerText = units;
            convertNode.AppendChild(unitsNode);

            return documento;
        }
    }
}
