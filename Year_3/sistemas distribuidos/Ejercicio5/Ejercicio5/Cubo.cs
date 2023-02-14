using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Cubo : Operacion
    {
        public Cubo(Int64 value) : base(value)
        {
        }

        public override Int64 Calcular()
        {
            return base.Calcular() * base.Calcular() * base.Calcular();
        }

    }
}
