using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;

namespace CitasForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            citaToolTip.SetToolTip(timeTextBox, "numero del 1 al 12");


        }

        string name;
        string slot;

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
    
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void toolTip1_Popup(object sender, PopupEventArgs e)
        {

        }

        private void RequestButton_Click(object sender, EventArgs e)
        {
            this.name = nameTextBox.Text;
            this.slot = timeTextBox.Text;

            // se levanta tcp client
            TcpClient tcpClient = new TcpClient("127.0.0.1", 13000);
            NetworkStream networkstream = tcpClient.GetStream();

            // se convierte en arreglo de bytes un xml con los datos del paciente
            Console.WriteLine(XMLConverter.Converter.returnXML(slot, name));
            byte[] bytesMessage = Encoding.ASCII.GetBytes(XMLConverter.Converter.returnXML(slot, name));

            networkstream.Write(bytesMessage, 0, bytesMessage.Length);

            // Se recibe y muestra la peticion
            byte[] bytesRespuesta = new byte[2048];
            int numBytesRespuesta = networkstream.Read(bytesRespuesta, 0, bytesRespuesta.Length);
            string Respuesta = Encoding.ASCII.GetString(bytesRespuesta);
            XmlDocument xmlDoc = new XmlDocument();
            xmlDoc.LoadXml(Respuesta);
            System.Windows.Forms.MessageBox.Show(xmlDoc.SelectSingleNode("//response").InnerText);



        }

        private void timeTextBox_MouseHover(object sender, EventArgs e)
        {

        }
    }
}
