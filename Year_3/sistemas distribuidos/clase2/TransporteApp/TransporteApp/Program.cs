using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TransporteApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Bienvenido a mi programa");
            var elVehiculo = new Vehiculo("Mercedes");
            Console.WriteLine($"Velocidad del vehiculo:{elVehiculo.Velocidad}");


            elVehiculo.Acelerar(20);
            Console.WriteLine($"Velocidad del vehiculo:{elVehiculo.Velocidad}");

            elVehiculo.Acelerar(20, true);
            Console.WriteLine($"Velocidad del vehiculo:{ elVehiculo.Velocidad}");


            Console.WriteLine($"Numero de vehiculos:{Vehiculo.NumVehiculos}");


            Console.ReadLine();

        }

    }
}
