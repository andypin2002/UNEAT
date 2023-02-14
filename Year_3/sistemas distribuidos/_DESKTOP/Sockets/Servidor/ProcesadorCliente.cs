using System.Net.Sockets;

namespace Servidor
{
    internal class ProcesadorCliente
    {
        private TcpClient tcpclient;

        public ProcesadorCliente(TcpClient tcpclient)
        {
            this.tcpclient = tcpclient;
        }
    }
}