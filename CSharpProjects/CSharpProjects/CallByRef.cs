using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class CallByRef
    {
        static void Main(string[] args)
        {
            int value = 10;
            CallByReference(ref value);
            Console.WriteLine(value);

            Console.ReadLine();
            Console.ReadLine();
        }

        static void CallByReference(ref int a)
        {
            a += 10;
            Console.WriteLine("value is: " +a);
        }

    }
}
