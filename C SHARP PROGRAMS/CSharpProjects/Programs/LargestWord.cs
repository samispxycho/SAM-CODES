using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class LargestWord
    {
        static void Main(string[] args)
        {
            string str = "sameeer google";

            string str2 = "";               //TO STORE THE LARGEST ELEMENT
            int max = int.MinValue;         //TO COUNT THE LENGTH OF EACH ELEMENT

            string[] arr = str.Split(' ');
            
            foreach(string ele in arr)
            {
                if(ele.Length > max)
                {
                    max = ele.Length;
                    str2 = ele;
                }
            }
            Console.WriteLine(str2);
        }
    }
}
