using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class PallindromeArray
    {
        static void Main(string[] args)
        {
            int[] arr = { 2,1, 2, 3, 4, 5, 4, 3, 2, 1 ,2};
            int low = 0;
            int high = arr.Length - 1;

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
            else Console.WriteLine("Not pallindrome");
        }
    }
}
