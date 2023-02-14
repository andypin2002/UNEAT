using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web.Http;

namespace RESTWeatherAPI.Controllers
{
    public class WeatherProxyController : ApiController
    {
        public static async Task<HttpResponseMessage> Get(string city)
        {
            var client = new HttpClient();
            var weather = await client.GetAsync($"https://goweather.herokuapp.com/weather/{city}");
            weather.Headers.Remove("Access-Control-Allow-Origin");
            return weather;
        }
    }
}