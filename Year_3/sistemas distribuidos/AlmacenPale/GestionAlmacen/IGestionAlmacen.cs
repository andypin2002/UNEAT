using Extra;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace GestionAlmacen
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IGestionAlmacen" in both code and config file together.
    [ServiceContract]
    public interface IGestionAlmacen
    {
        [OperationContract]
        string AltaPale(Pale pale);

        [OperationContract]
        string BajaPale(string codigo);

        [OperationContract]
        void UbicarPale(string codigo, Ubicacion ubicacion);

        [OperationContract]
        Pale RecuperarPale(string codigo);

        [OperationContract]
        Ubicacion GetUbicacionPale(string codigo);

        [OperationContract]
        List<Pale> fetchPales();
    }

    [DataContract]
    public class Pale {
        [DataMember]
        public string Codigo { get; set; }

        [DataMember]
        public int Peso { get; set; }

        [DataMember]
        public Productos Producto { get; set; }

        [DataMember]
        public DateTime FechaDeCreacion { get; set; }

        public Pale(int peso, Productos producto){ 
            this.Codigo = Convert.ToString(Guid.NewGuid());
            this.Peso = peso;
            this.Producto = producto;
            this.FechaDeCreacion = DateTime.Now;
        }
    }

    [DataContract]
    public class Ubicacion
    {
        [DataMember]
        public string Pasillo { get; set; }

        [DataMember]
        public string Mano { get; set; }

        [DataMember]
        public string Columna { get; set; }

        [DataMember]
        public string Altura { get; set; }

        public Ubicacion(string pasillo, string mano, string columna, string altura) {
            this.Pasillo = pasillo;
            this.Mano = mano;
            this.Columna = columna;
            this.Altura = altura;
        }

    }
}
