using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Net;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ExamenPracial
{
    internal class Program
    {
        public static string[] citas = new string[12];
        static void Main(string[] args)
        {
            

            IPAddress ipadress = IPAddress.Parse("127.0.0.1");
            TcpListener tcpListener = new TcpListener(ipadress, 13000);
            tcpListener.Start();
            byte[] buffer = new byte[2048];

            while (true)
            {


                TcpClient tcpclient = tcpListener.AcceptTcpClient();
                NetworkStream networkStream = tcpclient.GetStream();
                var procesadorCliente = new ProcesadorCitas(tcpclient);
                Thread hiloProcesador = new Thread(new ThreadStart(procesadorCliente.Procesar));
                hiloProcesador.Start();
            }
        }
    }
}
