using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class PassByOutt
    {

        static void PassByOut(out int a)
        {
            a = 100;
            Console.WriteLine("value is: " +a);
        }
        static void Main(string[] args)
        {
            int value;
            PassByOut(out value);
            Console.WriteLine(value);

            Console.ReadLine();
            Console.ReadLine();
        }
    }
}
