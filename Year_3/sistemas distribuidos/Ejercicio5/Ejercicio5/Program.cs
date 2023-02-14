using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Operaciones lista = new Operaciones();

            for (int i = 1; i <= 15; i++)
            {
                if (i % 3 == 0) lista.AnnadirOperacion(new Cuadrado(i), (i - 1));
                else if ((i + 1) % 3 == 0) lista.AnnadirOperacion(new Factorial(i), (i - 1));
                else if ((i + 2) % 3 == 0) lista.AnnadirOperacion(new Cubo(i), (i - 1));
            }

            lista.MostrarResultados();
            Console.ReadLine();


        }
    }
}
