using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class PallinString
    {
        static void Main(string[] args)
        {
            string str = "abcdcba";
            int i = 0;
            int j = str.Length - 1;

            int check = 1;
            while (i < j)
            {
                if (str[i] != str[j])
                {
                    check = 0;
                    break;
                }
                i++;j--;
            }
            if (check == 1) Console.WriteLine("Pallindrome");
            else Console.WriteLine("Not Pallindrome");
        }
    }
}
