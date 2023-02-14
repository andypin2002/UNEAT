using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            bool finalizar = false;

            do
            {
                Console.WriteLine("1. Mostrar primos");
                Console.WriteLine("2. Mostrar no primos");
                Console.WriteLine("3. Finalizar");

                var eleccion = Convert.ToInt16(Console.ReadLine());

                if (eleccion == 1) Varios.MostrarPrimos();
                else if (eleccion == 2) Varios.MostrarNoPrimos();
                else if (eleccion == 3) finalizar = true;
                else Console.WriteLine("Esa entrada no es válida");
                Console.WriteLine("");
            }
            while (!finalizar);
        }
    }
}
