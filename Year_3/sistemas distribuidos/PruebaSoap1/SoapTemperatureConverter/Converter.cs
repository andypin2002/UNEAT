using SoapTemperatureConverter.TemperatureConverter;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;

namespace SoapTemperatureConverter
{
    public class Converter
    {
        public static string FtoC(string faren) {
            TemperatureConverter.TempConvertSoapClient client = new TemperatureConverter.TempConvertSoapClient("TempConvertSoap");
            var a = client.FahrenheitToCelsius(faren);
            return a;
        }

    }
}
