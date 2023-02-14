using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace RESTWeatherAPIForm
{
    public partial class Form1 : Form
    {


        public Form1()
        {
            InitializeComponent();
            this.Text = "La Aplicación del Tiempo";
            propertyGrid1.SelectedObject = null;
        }

        private async void button1_ClickAsync(object sender, EventArgs e)
        {

            HttpClient client = new HttpClient();

            client.BaseAddress = new Uri("https://localhost:44318/api/");

            var response = await client.GetStringAsync($"weather?city={textBox1.Text}");

            CondicionesActuales data = JsonConvert.DeserializeObject<CondicionesActuales>(response);

            propertyGrid1.SelectedObject = data;
        }
    }

    public class CondicionesActuales
    {
        public string Temperature { get; set; }
        public string Wind { get; set; }
        public string Description { get; set; }
    }
}
