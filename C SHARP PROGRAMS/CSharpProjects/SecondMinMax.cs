using System;
using System.Collections.Generic;
using System.Diagnostics.Eventing.Reader;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class SecondMinMax
    {
        static void Main(string[] args)
        {
            int[] arr = { 10, 20, 30, 40, 50, 60 };

            //Calculating the highest
            int max = int.MinValue;
            int min = int.MaxValue;

            foreach(int ele in arr)
            {
                if (ele > max) max = ele;
                if (ele < min) min = ele;
            }

            int s_max = int.MinValue;
            int s_min = int.MaxValue;
            foreach(int ele in arr)
            {
                if (ele > s_max && ele != max) s_max = ele;
                if(ele < s_min && ele != min) s_min = ele;
            }
            Console.WriteLine("2nd largest element is "+s_max);
            Console.WriteLine("2nd smallest element is "+s_min);

        }
    }
}
