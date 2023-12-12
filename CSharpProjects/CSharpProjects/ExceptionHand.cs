using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class ExceptionHand
    {
        static void Main(string[] args)
        {
            /*
            //Default throw, default catch
            int a = 10;
            int b = 0;
            Console.WriteLine(a / b);
            */

            /*
            //Default throw, our catch
            int a = 10;
            int b = 0;
            try
            {
                Console.WriteLine(a / b);
            }catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
            */

            /*
            //Our throw, default catch
            int age = int.Parse(Console.ReadLine());
            if(age > 18)
            {
                Console.WriteLine("You can vote");
            }
            else
            {
                throw new Exception("You cannot vote");
            }
            */

            /*
            //Our throw, our catch
            int age = int.Parse(Console.ReadLine());
            try
            {
                if (age > 18) Console.WriteLine("You can vote");
                else throw new Exception("You cannot vote");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            */
            Console.WriteLine("...");


        }
    }
}
