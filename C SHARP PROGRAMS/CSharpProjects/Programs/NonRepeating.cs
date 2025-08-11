using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class NonRepeating
    {
        static void Main(string[] args)
        {
            string str = "google";
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.Length; i++)
            {
                for(int j =  i+1; j < str.Length; j++)
                {
                    if (str[i] != str[j]) sb.Append(str[i]);
                }
            }
            Console.WriteLine(sb.ToString());
        }
    }
}
