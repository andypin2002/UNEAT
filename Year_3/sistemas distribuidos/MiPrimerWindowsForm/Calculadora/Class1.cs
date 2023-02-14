using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculadora
{
    public class CalcLogic : iCalcLogic
    {
       

        public float Suma(float num1, float num2){return num1 + num2;}

        public float Resta(float num1, float num2) {return num1 - num2;}

        public float Multiplicacion(float num1, float num2) {return num1 * num2;}

        public float Division(float num1, float num2) { return num1 / num2; }

        public float Porcentaje(float num1, float perc) { return num1 + (num1 * perc / 100);}

        public float Inverse(float num1) { return 1 / num1; }

        public float Square(float num1) { return num1 * num1; }

        public float Sqrt(float num1) { return (float)Math.Sqrt( num1); }
    }
}
