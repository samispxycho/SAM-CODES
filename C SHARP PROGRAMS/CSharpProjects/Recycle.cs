using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class Recycle
    {
        static void Main(string[] args)
        {
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());

            int[] arr = { 1, 2 };

            try
            {
                Console.WriteLine("result is: " + (num1 / num2));
                Console.WriteLine(arr[9]);

            }catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
           
        }

    }
}
