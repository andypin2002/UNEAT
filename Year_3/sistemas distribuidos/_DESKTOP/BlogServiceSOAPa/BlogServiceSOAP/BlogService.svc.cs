using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Dispatcher;
using System.Text;
using System.Threading.Tasks;

namespace BlogServiceSOAP
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "BlogService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select BlogService.svc or BlogService.svc.cs at the Solution Explorer and start debugging.
    public class BlogService : IBlogService
    {
        public async Task<SuperPost> getPost(int id)
        {
            HttpClient postClient = new HttpClient();
            postClient.BaseAddress = new Uri("https://jsonplaceholder.typicode.com/posts/");

            HttpClient commentClient = new HttpClient();
            commentClient.BaseAddress = new Uri("https://jsonplaceholder.typicode.com/posts/");

            var postResponse = await postClient.GetAsync($"{id}");
            var post = await postResponse.Content.ReadAsStringAsync();
            var deserializedPost = JsonConvert.DeserializeObject<SuperPost>(post);


            var commentsResponse = await commentClient.GetAsync($"{id}/comments");
            var comments = await commentsResponse.Content.ReadAsStringAsync();
            var deserializedComments = JsonConvert.DeserializeObject<List<Comment>>(comments);



            SuperPost superPost = new SuperPost();

            superPost.userId = deserializedPost.userId; 
            superPost.id = deserializedPost.id; 
            superPost.title = deserializedPost.title; 
            superPost.body = deserializedPost.body;
            superPost.Comments = deserializedComments;


            return superPost;
        }
    }
}
