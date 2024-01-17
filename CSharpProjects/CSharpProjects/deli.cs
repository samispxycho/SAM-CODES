using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    public delegate void Calc(int a, int b);
    internal class deli
    {
        public static void add(int num1,int num2) {
            Console.WriteLine("Addition is: " + (num1 + num2));
        }

        public static void sub(int num1,int num2)
        {
            Console.WriteLine("Subtraction is: " + (num1 - num2));
        }

        public static void mul(int num1,int num2)
        {
            Console.WriteLine("Multiplication is: " + (num1 * num2));
        }

        public static void div(int num1, int num2)
        {
            Console.WriteLine("Division is: " + (num1 / num2));
        }

        static void Main(string[] args)
        {

            Calc obj = new Calc(deli.add);

            Console.WriteLine("Press 1 to perform addition \n" +
                "Press 2 to perform substraction \n" +
                "Press 3 for mul \n" +
                "Press 4 div \n");
            int choice = Convert.ToInt32(Console.ReadLine());

            if(choice == 1)
            {
                int x1 = int.Parse(Console.ReadLine());
                int x2 = int.Parse(Console.ReadLine());
                obj.Invoke(x1,x2);
            }else if(choice == 2)
            {
                obj = sub;
                int x1 = int.Parse(Console.ReadLine());
                int x2 = int.Parse(Console.ReadLine());
                obj.Invoke(x1, x2);
            }
            else if(choice == 3)
            {
                obj = mul;
                int x1 = int.Parse(Console.ReadLine());
                int x2 = int.Parse(Console.ReadLine());
                obj.Invoke(x1, x2);
            }
            else
            {
                obj = div;
                int x1 = int.Parse(Console.ReadLine());
                int x2 = int.Parse(Console.ReadLine());
                obj.Invoke(x1, x2);
            }
        }
    }
}
