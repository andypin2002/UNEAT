using SoapTemperatureConverter;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PruebaSoap1
{
    public partial class Form1 : Form
    {
        bool mode = false;
        float from;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }


        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void convertButton_Click(object sender, EventArgs e)
        {
            MessageBox.Show(Converter.FtoC("100"));
        }

        private void fromBox_TextChanged(object sender, EventArgs e)
        {
            from = Convert.ToInt32(fromBox.Text);
        }

        private void mode1_CheckedChanged(object sender, EventArgs e)
        {
            this.mode = false;
            mode2.Checked = false;
        }

        private void mode2_CheckedChanged(object sender, EventArgs e)
        {
            this.mode = true;
            mode1.Checked = false;
        }

    }
}
