using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace BlogServiceSOAP
{
    [ServiceContract]
    public interface IBlogService
    {
        [OperationContract]
        Task<SuperPost> getPost(int id); 
    }
}
