using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace GestionPaleREST
{
    public class Pale
    {
        public int Peso { get; set; }
        public string Producto { get; set; }
        public string Codigo { get; set; }
        public DateTime FechaDeCreacion { get; set; }

        public Pale(int Peso, string Producto)
        {
            this.Peso = Peso;
            this.Producto = Producto;
            this.Codigo = Convert.ToString(Guid.NewGuid());
            this.FechaDeCreacion = DateTime.Now;
        }
    }
}