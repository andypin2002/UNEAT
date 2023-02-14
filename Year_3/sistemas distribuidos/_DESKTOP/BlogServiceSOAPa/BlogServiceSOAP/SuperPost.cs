using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BlogServiceSOAP
{
    public class SuperPost
    {
        public int userId { get; set; }
        public int id { get; set; }
        public string title { get; set; }
        public string body { get; set; }
        public List<Comment> Comments { get; set; }

    }

    public class Comment {
        public int id { get; set; }
        public string name { get; set; }
        public string email { get; set; }
        public string body { get; set; }
    }
}