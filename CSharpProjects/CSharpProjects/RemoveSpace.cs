using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class RemoveSpace
    {
        static void Main(string[] args)
        {
            string str = "this is graphic era university";
            StringBuilder sb = new StringBuilder();

            foreach(char ele in str)
            {
                if(ele!= ' ') sb.Append(ele);
            }
            Console.WriteLine(sb.ToString());
        }
    }
}
