using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace ClienteSockets
{
    internal class Program
    {
        static void Main(string[] args)
        {
            TcpClient tcpClient = new TcpClient("127.0.0.1", 13000);
            NetworkStream networkstream = tcpClient.GetStream();
            byte[] bytesMessage = Encoding.ASCII.GetBytes("Un mensaje de prueba");
            networkstream.Write(bytesMessage, 0, bytesMessage.Length);

            byte[] bytesRespuesta = new byte[256];
            int numBytesRespuesta = networkstream.Read(bytesRespuesta, 0, bytesRespuesta.Length);
            string Respuesta = Encoding.ASCII.GetString(bytesRespuesta);
            Console.WriteLine("RESPUESTA RECIBIDA EN CLIENTE: " + Respuesta);

            Console.ReadLine();
        }
    }
}
