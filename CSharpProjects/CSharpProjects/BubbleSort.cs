using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class BubbleSort
    {
        static void Main(string[] args)
        {
            int[] arr = { 5, 4, 3, 2, 1 };
            for(int i = arr.Length - 1; i >= 1; i--)
            {
                for(int j = 0;j<=i - 1; j++)
                {
                    if (arr[j] > arr[j+1]) Swap(arr, j,j+1);
                }
            }

            foreach(int ele in arr) Console.Write(ele + " ");
        }

        public static void Swap(int[] arr,int i ,int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    }
}
