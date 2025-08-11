using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    public delegate void Calculate(int a, int b);
    public delegate void show_dele();
   
    internal class Delegates2
    {
        public static void add(int a,int b)
        {
            int result = a + b;
            Console.WriteLine(result);
        }

        public static void show()
        {
            Console.WriteLine("This is show method");
        }

        static void Main(string[] args)
        {
            Calculate obj1 = new Calculate(Delegates2.add);
            obj1.Invoke(10, 20);

            show_dele obj2 = new show_dele(show);
            obj2();
        }
    }
}
