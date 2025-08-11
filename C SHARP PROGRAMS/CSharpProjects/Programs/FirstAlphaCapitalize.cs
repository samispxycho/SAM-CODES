using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class FirstAlphaCapitalize
    {
        static void Main(string[] args)
        {
            string str = "this is a cat";

            string[] arr =str.Split(' ');

            for (int i = 0;i <arr.Length;i++)
            {
                string word = arr[i];

                char[] alpha = word.ToCharArray();

                for(int j = 0;j < alpha.Length;j++)
                {
                    char.ToUpper(alpha[j]);
                    char.ToLower(alpha[alpha.Length - 1]);
                }

                arr[i] = new string(alpha);
            }
            Console.WriteLine(string.Join(" ",arr));


        }
    }
}
