using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{

    internal class Operacion
    {
        protected readonly Int64 Value;



        public Operacion(Int64 value) {
            this.Value = value;
        }

        virtual public Int64 Calcular() {
            return Value;
        }

        public override string ToString()
        {
            return $"{this.GetType().Name} de {this.Value}";
        }
    }
}
