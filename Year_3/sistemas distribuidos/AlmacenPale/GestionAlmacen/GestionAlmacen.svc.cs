using Extra;
using System;
using System.CodeDom;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace GestionAlmacen
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "GestionAlmacen" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select GestionAlmacen.svc or GestionAlmacen.svc.cs at the Solution Explorer and start debugging.
    public class GestionAlmacen : IGestionAlmacen
    {
        static List<Pale> ListaDePales = new List<Pale>();
        static List<KeyValuePair<string, Ubicacion>> Ubicaciones = new List<KeyValuePair<string, Ubicacion>>();
        

        public string AltaPale(Pale pale)
        {
            Pale newPale = new Pale(pale.Peso, pale.Producto);
            try
            {
                ListaDePales.Add(newPale);
            }
            catch (Exception error)
            {
                return error.ToString();
            }
            
            return $"Pale agregado exitosamente: {newPale.Codigo}";
        }

        public string BajaPale(string codigo)
        {
            for (int i = 0; i < ListaDePales.Count; i++)
            {
                var paleActual = (Pale) ListaDePales[i];
                if (paleActual.Codigo.Equals(codigo))
                {
                    ListaDePales.RemoveAt(i);
                    return $"Pale eliminado exitosamente: {paleActual.Codigo}";
                }
            }
            return $"Ese pale no existe.";
        }

        public Ubicacion GetUbicacionPale(string codigo)
        {
            for (int i = 0; i < Ubicaciones.Count; i++)
            {
                var ubicacionActual = (string)Ubicaciones[i].Key;
                if (ubicacionActual.Equals(codigo))
                {
                    return Ubicaciones[i].Value;
                }
            }
            return null;
        }

        public Pale RecuperarPale(string codigo)
        {
            for (int i = 0; i < ListaDePales.Count; i++)
            {
                var paleActual = (Pale)ListaDePales[i];
                if (paleActual.Codigo.Equals(codigo))
                {
                    return paleActual;
                }
            }
            return null;
        }

        public void UbicarPale(string codigo, Ubicacion ubicacion)
        {
            var paleActual = RecuperarPale(codigo);
            if (paleActual != null) {
                Ubicaciones.Add(new KeyValuePair<string, Ubicacion>(codigo, ubicacion));
            }
        }

        public List<Pale> fetchPales() {
            return ListaDePales;
        }

    }
}
