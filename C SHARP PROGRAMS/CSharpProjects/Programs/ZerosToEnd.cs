using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class ZerosToEnd
    {
        static void Main(string[] args)
        {
            int[] arr = { 2, 2, 0, 1, 0, 2, 0, 1, 1, 0, 2, 1 };


            /*int[] arr2= new int[arr.Length];
            int czero = 0;
            int cone = 0;
            int ctwo = 0;
            foreach(int ele in arr)
            {
                if (ele == 0) czero++;
                else if (ele == 1) cone++;
                else ctwo++;
            }
            for(int i = 0;i<arr.Length;i++)
            {
                if(ctwo > 0)
                {
                    arr2[i] = 2;
                    ctwo--;
                }
                else if(cone > 0)
                {
                    arr2[i] = 1;
                    cone--;
                }
                else
                {
                    arr2[i] = 0;
                    czero--;
                }
            }

            foreach (int e in arr2) Console.Write(e + " "); */

            int low = 0;
            int mid = 0;
            int high = arr.Length - 1;

            while (mid <= high)
            {
                if (arr[mid] == 0)
                {
                    Swap(arr, mid, high);
                    high--;
                }
                else if (arr[mid] == 1)
                {
                    mid++;
                }
                else
                {
                    Swap(arr, low, mid);
                    low++;
                    mid++;
                    
                }
            }

            foreach(int ele in arr)
            {
                Console.Write(ele+" ");
            }
        }

        public static void Swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
