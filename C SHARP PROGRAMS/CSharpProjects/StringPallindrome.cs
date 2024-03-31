using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class StringPallindrome
    {
        static void Main(string[] args)
        {
            string str = "abcba";
            char[] arr = str.ToCharArray();
            int low = 0;
            int high = str.Length - 1;

            int result = 1;
            while(low < high)
            {
                if (arr[low] != arr[high])
                {
                    result = 0;
                    break;
                }
                low++;high--;
            }
            if(result == 1) Console.WriteLine("Pallindrome");
            else Console.WriteLine("Not Pallindrome");
        }
    }
}
