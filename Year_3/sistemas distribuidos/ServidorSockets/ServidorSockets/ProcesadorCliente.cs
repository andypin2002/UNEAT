using System;
using System.Net.Sockets;
using System.Text;
using System.Xml;

namespace ServidorSockets
{
    internal class ProcesadorCliente
    {
        public TcpClient tcpClient;

        public ProcesadorCliente(TcpClient tcpClient)
        {
            this.tcpClient = tcpClient;
        }

        public void Procesar()
        {
            byte[] buffer = new byte[1024];
            string data;
            NetworkStream networkStream = tcpClient.GetStream();
            int indice = 0;

            while ((indice = networkStream.Read(buffer, 0, buffer.Length)) != 0) { 
                data = System.Text.Encoding.ASCII.GetString(buffer, 0, indice);
                Console.WriteLine("MENSAJE RECIBIDO: " + data);
                var respuesta = data.ToUpper();
                byte[] bytesRespuesta = Encoding.ASCII.GetBytes(respuesta);
                networkStream.Write(bytesRespuesta, 0, bytesRespuesta.Length);
            }
        }
    }
}