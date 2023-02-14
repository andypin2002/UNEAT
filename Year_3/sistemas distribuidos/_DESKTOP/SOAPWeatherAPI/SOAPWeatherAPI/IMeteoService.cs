using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace SOAPWeatherAPI
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IMeteoService" in both code and config file together.
    [ServiceContract]
    public interface IMeteoService
    {
        [OperationContract]
        Task<CondicionesActuales> GetCondicionesAsync(string city);
    }
}
