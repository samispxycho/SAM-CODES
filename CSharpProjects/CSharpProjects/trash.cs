using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class trash
    {
        static void Main(string[] args)
        {
            string str = "samabs";
            int low = 0;
            int high = str.Length - 1;

            bool check = true;
            while(low<= high)
            {
                if (str[low] != str[high])
                {
                    check = false;
                    break;
                }
                low++;high--;
            }
            if(check == true)
            {
                Console.WriteLine("Pallindrome");

            }
            else
            {
                Console.WriteLine("Not");
            }
            
        }
    }
}
