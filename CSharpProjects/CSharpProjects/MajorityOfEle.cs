using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class MajorityOfEle
    {
        static void Main(string[] args)
        {
            int[] arr = {5, 4, 5, 3, 5, 2, 6, 5, 5, 4,5,5,2 ,9 };

            int max = int.MinValue;

            for(int i = 0; i < arr.Length; i++)
            {
                int count = 0;
                for(int j = 0; j < arr.Length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        count++;
                    }

                    if (count > max) max = count;
                }

            }
            Console.WriteLine(max);
        }
    }
}
