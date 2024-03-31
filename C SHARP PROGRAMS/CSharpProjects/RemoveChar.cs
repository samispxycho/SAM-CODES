using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class RemoveChar
    {
        static void Main(string[] args)
        {
            string str = "take12%*&u^$#forward";
            StringBuilder sb = new StringBuilder();
            foreach(char ele in str)
            {
                if(char.IsLetter(ele)) sb.Append(ele);
            }
            Console.WriteLine(sb.ToString());

        }
    }
}
