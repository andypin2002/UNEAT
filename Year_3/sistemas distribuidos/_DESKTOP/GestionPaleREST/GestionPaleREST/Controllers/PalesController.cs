using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace GestionPaleREST.Controllers
{
    
    
    public class PalesController : ApiController
    {
        static GestionAlmacen almacen = new GestionAlmacen();

        // GET api/<controller>
        public List<Pale> Get()
        {
            return almacen.GetListaPales();
        }

        // GET api/<controller>/5
        public string Get(string codigo)
        {
            return "value";
        }

        // POST api/<controller>
        public Pale Post([FromBody] Pale pale)
        {
            return almacen.AltaPale(pale);
        }

        // PUT api/<controller>/5
        public void Put(int id, [FromBody] string value)
        {
        }

        // DELETE api/<controller>/5
        public string Delete(string codigo)
        {
            return almacen.BajaPale(codigo);
        }
    }
}