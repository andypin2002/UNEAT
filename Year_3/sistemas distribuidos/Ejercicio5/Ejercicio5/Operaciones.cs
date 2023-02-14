using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Operaciones
    {
        private readonly Operacion[] lista = new Operacion[15];

        public void AnnadirOperacion(Operacion operacion, int index) {
            this.lista[index] = operacion;
        }

        public void MostrarResultados() {
            foreach (Operacion operacion in this.lista) { 
                Console.WriteLine($"Clase {operacion.ToString()}, resultado {operacion.Calcular()}");
            }
        }
    }
}
