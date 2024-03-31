using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    public delegate void Calculation(int a, int b); 
    internal class Delegates
    {
        public static void Addition(int a, int b)
        {
            int result = a + b;
            Console.WriteLine("Addition is: "+result);
        }

        public static void Substraction(int a, int b)
        {
            int result = a - b;
            Console.WriteLine("Substraction is: " + result);
        }

        public static void Multiplication(int a,int b)
        {
            int result = a * b;
            Console.WriteLine("Multiplication is: " + result);
        }

        public static void Division(int a,int b)
        {
            int result = a / b;
            Console.WriteLine("Division is: " + result);
        }

        static void Main(string[] args)
        {
            Calculation obj = new Calculation(Delegates.Addition);
            obj.Invoke(10, 20);

            //Changing delegate object's value
            obj = Substraction;
            obj(30, 10);            //Another way to invoke

            obj = Multiplication;
            obj.Invoke(10, 2);

            obj = Division;
            obj(10, 2);
            

            Console.ReadLine();
        }
    }
}
