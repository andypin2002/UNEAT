using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace TransporteApp
{
    public class Vehiculo

    {

        public int Longitud;
        public int Velocidad = 0;
        public readonly string Marca;
        private static int numVehiculos = 0;

        public static int NumVehiculos { get { return Vehiculo.numVehiculos; } }

        public String Matricula { get; set; }

        public Vehiculo(String marca) : this(marca, 0) { }
        public Vehiculo(String marca, int velocidad)
        {
            this.Marca = marca;
            this.Velocidad = velocidad;
            Vehiculo.numVehiculos += 1;

        }


        public void Acelerar(int incremento)
        {
            this.Acelerar(incremento, false);
        }

        public void Acelerar(int incremento, bool turbo)
        {
            if (incremento < 1)
            {
                throw new InvalidOperationException("No se puede frenar con el metodo Acelerar");
            }
            this.CambiarVelocidad(incremento, turbo);
        }

        public void Frenar(int decremento)
        {
            if (decremento < 1)
            {
                throw new InvalidOperationException("No se puede acelerar con el metodo Frenar");
            }
            this.CambiarVelocidad(decremento * -1, false);
        }


        private void CambiarVelocidad(int velocidad, bool turbo)
        {
            if (turbo)
            {
                Thread.Sleep(500);
            }
            else
            {
                Thread.Sleep(1000);
            }

            this.Velocidad += velocidad;
        }
    }
}
