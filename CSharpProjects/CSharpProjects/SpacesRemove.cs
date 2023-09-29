using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class SpacesRemove
    {
        static void Main(string[] args)
        {
            string str = "This Is Graphic Era University";
            StringBuilder sb = new StringBuilder();
            foreach(char ele in str)
            {
                if(ele!=' ')sb.Append(ele);
            }
            Console.WriteLine(sb.ToString());

        }
    }
}
