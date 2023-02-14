using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio3
{
    internal class Arranque
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Valor a operar:");
            Entero number = new Entero(Convert.ToInt32(Console.ReadLine()));

            Console.WriteLine("El cuadrado de " + number.valor + " es " + number.CalcularCuadrado());
            Console.WriteLine("El cubo de " + number.valor + " es " + number.CalcularCubo());

            Console.ReadLine();

        }
    }
}
