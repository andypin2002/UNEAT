using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.ServiceModel.Configuration;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestionAlmacenFormAsync
{
    public partial class PaleList : Form
    {
        ServiceReference1.GestionAlmacenClient cliente = new ServiceReference1.GestionAlmacenClient();
        ServiceReference1.Pale[] lista;

        public PaleList()
        {
            InitializeComponent();
        }

        private async Task fetchPales() { 
            lista =  await this.cliente.fetchPalesAsync();
        }

        private async void PaleList_Load(object sender, EventArgs e)
        {
            await fetchPales();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
