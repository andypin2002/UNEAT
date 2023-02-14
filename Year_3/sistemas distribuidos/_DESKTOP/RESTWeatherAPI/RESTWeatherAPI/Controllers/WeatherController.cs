using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web;
using System.Web.Http;
using System.Web.Mvc;

namespace RESTWeatherAPI.Controllers
{
    public class WeatherController : ApiController
    {

        // GET: Weather/Details/5
        public async Task<CondicionesActuales> GetAsync(string city)
        {
            var condicionesActuales = await WeatherProxyController.Get(city);

            if (condicionesActuales.Content == null) {

                CondicionesActuales error = new CondicionesActuales();
                error.Temperature = "0 °C";
                error.Description = "NA";
                error.Wind = "0 KM/H";

                return error;
            }
            var resultado = await condicionesActuales.Content.ReadAsStringAsync();

            
            return JsonConvert.DeserializeObject<CondicionesActuales>(resultado);
        }

    }
}
