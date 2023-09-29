using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class PrimeWithinRange
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the range: ");
            int range = int.Parse(Console.ReadLine());

            for(int i = 2; i <= range; i++)
            {
                int count = 1;
                for(int j = 2; j <= range; j++)
                {
                    if (i % j == 0) count++;
                }
                if(count == 2) Console.WriteLine(i);
            }
        }
    }
}
