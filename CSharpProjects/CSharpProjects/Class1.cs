using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    public delegate void subb(int a, int b);

    internal class Class1
    {
        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 2};

            int low = 0;
            int high = arr.Length-1;

            int flag = 1;
            while (low <= high)
            {
                if (arr[low] != arr[high])
                {
                    flag = 0;
                    break;
                }
                low++;high--;
            }
            if(flag == 1)
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
