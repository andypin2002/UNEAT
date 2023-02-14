using Extra;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestionAlmacenFormAsync
{
    public partial class AddPale : Form
    {
        public AddPale()
        {
            InitializeComponent();
            this.productOptions.DataSource = Enum.GetValues(typeof(Productos));
            this.productOptions.DropDownStyle = ComboBoxStyle.DropDownList;
        }

        private async void AddPaleButton_Click(object sender, EventArgs e)
        {
            ServiceReference1.GestionAlmacenClient cliente = new ServiceReference1.GestionAlmacenClient();

            ServiceReference1.Pale pale = new ServiceReference1.Pale();
            pale.Peso = Convert.ToInt32(numericUpDown1.Value);
            pale.Producto = (Productos) productOptions.SelectedItem;

            string response = await cliente.AltaPaleAsync(pale);

            MessageBox.Show(response);

        }
    }
}
