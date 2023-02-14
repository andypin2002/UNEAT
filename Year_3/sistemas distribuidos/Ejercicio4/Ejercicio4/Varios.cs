using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio4
{
    internal class Varios
    {
            
        public static void MostrarPrimos() {
            CalcularNumeros(1, 30, true);
        }

        public static void MostrarNoPrimos()
        {
            CalcularNumeros(1, 30, false);
        }

        private static void CalcularNumeros(int min, int max, bool primo) {
            for (int i = min; i <= max; i++)
            {
                if (primo) {
                    if (((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) || (i == 2) || (i == 3) || (i == 5) || (i == 7)) 
                    {
                        Console.WriteLine("El numero " + i + " es primo");
                    }
                }
                else
                {
                    if (((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) && (i != 2) && (i != 3) && (i != 5) && (i != 7))
                    {
                        Console.WriteLine("El numero " + i + " no es primo");
                    }
                }

            };
            Console.WriteLine("");
        }
    }
}
