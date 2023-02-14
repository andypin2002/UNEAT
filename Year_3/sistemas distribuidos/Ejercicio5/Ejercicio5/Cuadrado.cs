using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Cuadrado : Operacion
    {
        public Cuadrado(Int64 value) : base(value)
        {
        }

        public override Int64 Calcular()
        {
            return base.Value * base.Value;
        }

        
    }
}
