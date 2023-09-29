using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class SumOfDigits
    {
        static void Main(string[] args)
        {
            int[] arr = { 1, 2, 3, 4, 5 };
            int sum = 0;
            foreach (int ele in arr) sum += ele;
            Console.WriteLine(sum);
        }
    }
}
