using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace OnlineShop
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
            protected void Unnamed1_Click1(object sender, EventArgs e)
        {
                
            var conn = new SqlConnection(AppConsts.ConnectionString);
            conn.Open();
            string query = "Select UsrEmail, UsrPassword from Users where UsrEmail='" + email.Text + "' and UsrPassword = '" + pass.Text + "'";
            var command = new SqlCommand(query, conn);
            
            using(var reader =  command.ExecuteReader())
            {

                //while(reader.Read())
                //{
                //    string name = reader.GetString(1);
                //}
              //  command.ExecuteNonQuery();

                if (reader.Read())
                {
                    var usrData = new UserData();
                    usrData.Email = email.Text;
                    Session["UserData"] = usrData;
                    //user data is valid
                    Response.Redirect(@".\UserDashboard.aspx" , true);
                }
                else
                {
                    lblError.Text = "Invalid username and password.";
                    lblError.Visible = true;
                }
            }
        }
    }
    public class UserData
    {
        public string Email { set; get; }
        public string Name { set; get; }
    }
}
