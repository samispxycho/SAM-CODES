using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class AnugramStr
    {
        static void Main(string[] args)
        {
            string str1 = "cat";
            string str2 = "act";

            char[] arr1 = str1.ToCharArray();
            char[] arr2 = str2.ToCharArray();

            Array.Sort(arr1);
            Array.Sort(arr2);

            str1 = new string(arr1);
            str2 = new string(arr2);

            Console.WriteLine(str1.Equals(str2));
        }
    }
}
