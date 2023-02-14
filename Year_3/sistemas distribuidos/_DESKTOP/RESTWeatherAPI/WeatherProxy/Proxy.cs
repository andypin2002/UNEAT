using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WeatherProxy
{
    public static class Proxy
    {
        public static async Task<CondicionesActuales> GetCondicionesActualesAsync(string city) {
            HttpClient httpClient = new HttpClient();

            httpClient.BaseAddress = new Uri("https://goweather.herokuapp.com/weather/");
            HttpResponseMessage response;
            CondicionesActuales resp = new CondicionesActuales();
            try
            {
                response = await httpClient.GetAsync(city);
                var resultado = await response.Content.ReadAsStringAsync();

                var currentWeather = JsonConvert.DeserializeObject<CondicionesActuales>(resultado);

                return currentWeather!;
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
