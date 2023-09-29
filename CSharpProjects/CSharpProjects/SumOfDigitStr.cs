using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class SumOfDigitStr
    {
        static void Main(string[] args)
        {
            string str = "sam17ee45r2";
            int sum = 0;
            foreach(char ele in str)
            {
                if (char.IsDigit(ele))
                {
                    int num = (int)char.GetNumericValue(ele);
                    sum += num;
                }
            }
            Console.WriteLine(sum);
        }
    }
}
