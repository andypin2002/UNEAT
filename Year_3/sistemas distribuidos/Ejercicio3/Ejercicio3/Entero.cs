using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio3
{
    internal class Entero
    {
        public int valor { get; }

        public Entero(int valor) { 
            this.valor = valor;
        }
        public int CalcularCuadrado() => this.valor * this.valor;
        public int CalcularCubo() => CalcularCuadrado() * this.valor;
    }
}
