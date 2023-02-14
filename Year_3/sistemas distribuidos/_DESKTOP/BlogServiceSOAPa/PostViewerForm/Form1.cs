using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PostViewerForm
{
    public partial class Form1 : Form
    {
        BlogService.BlogServiceClient client = new BlogService.BlogServiceClient();
        public Form1()
        {
            InitializeComponent();
            this.Text = "Visor de Posts";
            BlogServiceSOAP.SuperPost post = new BlogServiceSOAP.SuperPost();
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            BlogServiceSOAP.SuperPost superPost = await client.getPostAsync((int)postId.Value);

            userId.Text = Convert.ToString(superPost.userId);
            title.Text = superPost.title;
            body.Text = superPost.body;

            dataGridView1.DataSource = superPost.Comments;

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }
    }
}
