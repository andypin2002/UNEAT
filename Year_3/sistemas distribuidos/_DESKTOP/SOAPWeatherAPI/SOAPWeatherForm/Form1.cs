using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SOAPWeatherForm
{
    public partial class Form1 : Form
    {
        ServiceReference1.MeteoServiceClient client = new ServiceReference1.MeteoServiceClient();
        public Form1()
        {
            InitializeComponent();
            this.Text = "La Aplicación del Tiempo";
            propertyGrid.SelectedObject = null;

        }

        private async void button1_Click(object sender, EventArgs e)
        {
            ServiceReference1.CondicionesActuales condiciones = await client.GetCondicionesAsync(textBox1.Text);
            propertyGrid.SelectedObject = condiciones;
        }
    }
}
