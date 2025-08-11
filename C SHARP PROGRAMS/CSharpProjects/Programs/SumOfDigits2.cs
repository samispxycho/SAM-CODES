using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class SumOfDigits2
    {
        static void Main(string[] args)
        {
            List<string> list = new List<string>();

            string str = "sam28ee2r";

            for(int i = 0; i < str.Length; i++)
            {
                if (char.IsDigit(str[i]))
                {
                    int start = i;
                    int len = 1;

                    for(int j = start+1; j < str.Length; j++)
                    {
                        if (char.IsDigit(str[j])) len++;
                        else break;
                    }
                    string sub = str.Substring(start, len);
                    list.Add(sub);
                    i = i + len;
                }
            }

            int sum = 0;
            foreach (string ele in list) sum += int.Parse(ele);
            Console.WriteLine(sum);


        }


    }
}
