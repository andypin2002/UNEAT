using Calculadora;
using System;
using System.CodeDom;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;

namespace MiPrimerWindowsForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public float first_num;
        public float second_num;
        public String operation;
        readonly iCalcLogic calculadora = new Calculadora.CalcLogic();
        private List<String> memory_list = new List<String>();

        
        // Number buttons
        private void bt0_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "0";
        }
        private void bt1_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "1";
        }
        private void bt2_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "2";
        }
        private void bt3_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "3";
        }
        private void bt4_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "4";
        }
        private void bt5_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "5";
        }
        private void bt6_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "6";
        }
        private void bt7_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "7";
        }
        private void bt8_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "8";
        }
        private void bt9_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += "9";
        }
        private void dot_Click(object sender, EventArgs e)
        {
            tx_Num1.Text += ".";
        }


        private void handleFirstInput() {
            if (!first_num.Equals("")) {
                this.first_num += float.Parse(tx_Num1.Text);   
            }
            else { 
                this.first_num = float.Parse(tx_Num1.Text);
            }
                tx_Num1.Text = "";
        }

        // Operations
        private void add_Click(object sender, EventArgs e)
        {
            handleFirstInput();
            this.operation = "addition";
        }
        private void subtract_Click(object sender, EventArgs e)
        {
            handleFirstInput();
            this.operation = "subtraction";
        }
        private void multiply_Click(object sender, EventArgs e)
        {
            handleFirstInput();
            this.operation = "multiplication";
        }
        private void divide_Click(object sender, EventArgs e)
        {
            handleFirstInput();
            this.operation = "division";
        }
        private void percentage_Click(object sender, EventArgs e)
        {
            handleFirstInput();
            var temp = calculadora.Porcentaje(this.first_num, float.Parse(tx_Num1.Text));
            tx_Num1.Text = Convert.ToString(temp);
        }
        private void inverse_Click(object sender, EventArgs e)
        {
            var temp = calculadora.Inverse(float.Parse(tx_Num1.Text));
            tx_Num1.Text = Convert.ToString(temp);
        }
        private void square_Click(object sender, EventArgs e)
        {
            var temp = calculadora.Square(float.Parse(tx_Num1.Text));
            tx_Num1.Text = Convert.ToString(temp);
        }
        private void sqrt_Click(object sender, EventArgs e)
        {
            var temp = calculadora.Sqrt(float.Parse(tx_Num1.Text));
            tx_Num1.Text = Convert.ToString(temp);
        }
        private void miniclear_Click(object sender, EventArgs e)
        {
            this.second_num = 0;
        }
        private void equals_Click(object sender, EventArgs e)
        {
            if (!tx_Num1.Text.Equals("")) {
                this.second_num = float.Parse(tx_Num1.Text);
                var result = "";
                if (this.operation.Equals("addition")) result = Convert.ToString(calculadora.Suma(this.first_num, this.second_num));
                else if (this.operation.Equals("subtraction")) result = Convert.ToString(calculadora.Resta(this.first_num, this.second_num));
                else if (this.operation.Equals("multiplication")) result = Convert.ToString(calculadora.Multiplicacion(this.first_num, this.second_num));
                else if (this.operation.Equals("division")) result = Convert.ToString(calculadora.Division(this.first_num, this.second_num));

                tx_Num1.Text = result;
                this.operation = "";
            }
        }
        private void clear_Click(object sender, EventArgs e)
        {
            this.operation = "";
            this.first_num = 0;
            this.second_num = 0;
            tx_Num1.Text = "";
        }
        private void negative_Click(object sender, EventArgs e)
        {
            if (tx_Num1.Text.Length == 0 || tx_Num1.Text[0] != '-')
            {
                tx_Num1.Text = "-" + tx_Num1.Text;
            }
            else if (tx_Num1.Text[0] == '-')
            {
                tx_Num1.Text = tx_Num1.Text.Substring(1);
            }
        }
        private void back_Click(object sender, EventArgs e)
        {
            if (tx_Num1.Text != "") { 
                tx_Num1.Text = tx_Num1.Text.Remove(tx_Num1.Text.Length - 1);
            }
        }
        //TODO: Memory Click
        private void memory_Click(object sender, EventArgs e)
        {
            
        }
        private void memory_store_Click(object sender, EventArgs e)
        {
            enableMemory();
            memory_list.Add(tx_Num1.Text);
            tx_Num1.Text = "";

        }
        private void memory_subtract_Click(object sender, EventArgs e)
        {
            enableMemory();
            memory_list.Add($"-{tx_Num1.Text}");
            tx_Num1.Text = "";
        }
        private void memory_add_Click(object sender, EventArgs e)
        {
            enableMemory();
            memory_list.Add($"+{tx_Num1.Text}");
            tx_Num1.Text = "";
        }
        private void memory_clear_Click(object sender, EventArgs e)
        {
            disableMemory();
            memory_list.Clear();
        }
        private void memory_retrieve_Click(object sender, EventArgs e)
        {
            var result = 0.0;
            foreach(String num in memory_list) {
                if (!num[0].Equals("")) { 
                    if (num[0] == '+') result += float.Parse(num.Substring(1));
                    else if (num[0] == '-') result -= float.Parse(num.Substring(1));
                }
            }
            tx_Num1.Text = Convert.ToString(result);
        }
        private void enableMemory() {
            memory.Enabled = true;
            memory_retrieve.Enabled = true;
            memory_clear.Enabled = true;
        }
        private void disableMemory()
        {
            memory.Enabled = false;
            memory_retrieve.Enabled = false;
            memory_clear.Enabled = false;
        }

        // Confirm Form Closure.
        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (MessageBox.Show("¿Seguro que deseas cerrar?", "Confirmar", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.No)
            {   
                e.Cancel = true;
            }
        }
    }
}
