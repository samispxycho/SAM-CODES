using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class LeftSortByOne
    {

        static void Main(string[] args)
        {
            int[] arr = {1,2,3,4,5 };


            for (int z = 0; z < 3; z++)
            {
                int len = arr.Length;
                int last = arr[len - 1];

                for (int i = arr.Length - 1; i > 0; i--)
                {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
            }
            foreach (int ele in arr) Console.Write(ele+" ");

        }
    }
}
