using System.Net.Http;
using System;
using System.Net.Sockets;
using System.Text;
using System.Xml;

namespace ExamenPracial
{
    internal class ProcesadorCitas
    {
        private TcpClient tcpclient;

        public ProcesadorCitas(TcpClient tcpclient)
        {
            this.tcpclient = tcpclient;
        }

        public void Procesar()
        {
            byte[] buffer = new byte[2048];
            string data;
            NetworkStream networkStream = tcpclient.GetStream();
            int indice = 0;

            while ((indice = networkStream.Read(buffer, 0, buffer.Length)) != 0)
            {
                XmlDocument document = new XmlDocument();
                data = System.Text.Encoding.ASCII.GetString(buffer, 0, indice);

                document.LoadXml(data);
                string nombre = document.SelectSingleNode("//nombreNode").InnerText;
                int id = Int32.Parse(document.SelectSingleNode("//horaNode").InnerText) -1;


                Console.WriteLine("Peticion recibida");

                string hora = definirHora(id);
                string respuesta;

                if (Program.citas[id] == null)
                {
                    Program.citas[id] = nombre;
                    Console.WriteLine("Cita guardada correctamente");
                    respuesta = $"Cita para {nombre} se ha guardado a las {hora}";
                }
                else {
                    Console.WriteLine("Cita no se pudo guardar");
                    respuesta = "Ese horario no esta disponible";
                }
                
                byte[] bytesRespuesta = Encoding.ASCII.GetBytes(XMLConverter.Converter.responseXML(respuesta));
                networkStream.Write(bytesRespuesta, 0, bytesRespuesta.Length);
            }
        }

        private string definirHora(int id) {
            switch (id)
            {
                case 0:
                    return "9:00";
                case 1:
                    return "9:30";
                case 2:
                    return "10:00";
                case 3:
                    return "10:30";
                case 4:
                    return "11:00";
                case 5:
                    return "11:30";
                case 6:
                    return "12:00";
                case 7:
                    return "12:30";
                case 8:
                    return "13:00";
                case 9:
                    return "13:30";
                case 10:
                    return "14:00";
                case 11:
                    return "14:30";
            }
            return "00:00";
        }

    }
}