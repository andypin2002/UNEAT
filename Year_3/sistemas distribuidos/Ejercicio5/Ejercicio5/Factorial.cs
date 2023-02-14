using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Factorial : Operacion
    {
        public Factorial(Int64 value) : base(value)
        {
        }

        public override Int64 Calcular()
        {

            return CalcularFactorial(base.Value);

        }

        private Int64 CalcularFactorial(Int64 n) {
            if (n <= 1) return 1;
            else return (n * CalcularFactorial(n-1));
        }

    }
}
