using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class Vowels
    {
        static void Main(string[] args)
        {
            string str = "sameer upadhyay";
            StringBuilder sb = new StringBuilder();
            str = str.ToLower();

            foreach (char ele in str)
            {
                if (ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u') continue;
                else sb.Append(ele);
            }
            Console.WriteLine(sb.ToString());

        }
    }
}
