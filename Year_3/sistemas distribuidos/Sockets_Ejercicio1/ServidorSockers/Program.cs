using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace ServidorSockets
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IPAddress ipadress = IPAddress.Parse("127.0.0.1");
            TcpListener tcpListener = new TcpListener(ipadress, 13000);
            tcpListener.Start();
            byte[] buffer = new byte[256];

            while (true)
            {
                TcpClient tcpclient = tcpListener.AcceptTcpClient();
                NetworkStream networkStream = tcpclient.GetStream();

                int indice = 0;
                while ((indice = networkStream.Read(buffer, 0, buffer.Length)) != 0)
                {
                    string data = Encoding.ASCII.GetString(buffer, 0, indice);
                    Console.WriteLine("MENSAJE RECIBIDO EN SERVIDOR: " + data);

                    var respuesta = data.ToUpper();
                    byte[] bytesRespuesta = Encoding.ASCII.GetBytes(respuesta);
                    networkStream.Write(bytesRespuesta, 0, bytesRespuesta.Length);

                    Console.ReadLine();
                }
            }

        }
    }
}
