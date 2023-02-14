using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace GestionPaleREST
{
    public class GestionAlmacen
    {
        static List<Pale> ListaDePales = new List<Pale>();

        public List<Pale> GetListaPales() { return ListaDePales; }
        public Pale AltaPale(Pale pale) {
            Pale newPale = new Pale(pale.Peso, pale.Producto);
            ListaDePales.Add(newPale);
            return newPale;
        }
        public string BajaPale(string codigo)
        {
            for (int i = 0; i < ListaDePales.Count; i++)
            {
                var paleActual = ListaDePales[i];
                if (paleActual.Codigo.Equals(codigo))
                {
                    ListaDePales.RemoveAt(i);
                    return $"Pale eliminado exitosamente: {paleActual.Codigo}";
                }
            }
            return $"Ese pale no existe.";
        }
    }
}