using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class CallByVal
    {

        private static void CallByValue(int a)
        {
            a += 10;
            Console.WriteLine("The value of a is: " + a);
        }
        static void Main(string[] args)
        {
            int x = 10;
            CallByValue(x);
            Console.WriteLine("The value in the main method is: " + x);


            Console.ReadLine();
            Console.ReadLine();
        }
    }
}
