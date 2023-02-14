using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ejercicio1
{
    internal class Program
    {
        static void Main(string[] args) { 

            Console.WriteLine("Calculadora Basica");
            Console.WriteLine("Primer valor: ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Segundo valor: ");
            var b = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Suma: " + Calculadora.suma(a, b));
            Console.WriteLine("Resta: " + Calculadora.resta(a, b));
            Console.WriteLine("Multiplicacion: " + Calculadora.multiplicacion(a, b));
            Console.WriteLine("Division: " + Calculadora.division(a, b));

            Console.ReadLine();


        }
    }
}
