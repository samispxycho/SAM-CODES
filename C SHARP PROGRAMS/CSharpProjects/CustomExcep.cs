using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class CustomExcep
    {
        static void Main(string[] args)
        {
            Console.Write("Enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());
            if(age >= 18)
            {
                Console.WriteLine("You are eligible to vote");
            }
            else
            {
                throw new Exception("You cant vote right now");
            }
        }
    }
}
