using   Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace SOAPWeatherAPI
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "MeteoService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select MeteoService.svc or MeteoService.svc.cs at the Solution Explorer and start debugging.
    public class MeteoService : IMeteoService
    {

        public async Task<CondicionesActuales> GetCondicionesAsync(string city)
        {
            HttpClient httpClient = new HttpClient();

            httpClient.BaseAddress = new Uri("https://goweather.herokuapp.com/weather/");
            HttpResponseMessage response;
            CondicionesActuales resp = new CondicionesActuales();
            try
            {
                response = await httpClient.GetAsync(city);
                var resultado = await response.Content.ReadAsStringAsync();

                var currentWeather = JsonConvert.DeserializeObject<CondicionesActuales>(resultado);

                return currentWeather;
            }
            catch (Exception)
            {
                resp.Temperature = "0°C";
                resp.Wind = "0 km/h";
                resp.Description = "Data unavailable";
            }
            return resp;
            
            
        }
    }
}
