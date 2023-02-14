using Extra;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace GestionAlmacenForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            this.typeSelector.DataSource = Enum.GetValues(typeof(Productos));
            this.typeSelector.DropDownStyle = ComboBoxStyle.DropDownList;

        }

    }
}
