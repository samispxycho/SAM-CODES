using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class TotalPrimeStr
    {
        static void Main(string[] args)
        {
            string str = "sam3ee64r7up5";
            int count = 0;
            foreach(char ele in str)
            {
                if (char.IsDigit(ele))
                {
                    int check = 1;
                    int d = (int)char.GetNumericValue(ele);
                    for(int i = 2; i <= d; i++)
                    {
                        if (d % i == 0) check++;
                    }
                    if (check == 2) count++;
                }
            }
            Console.WriteLine(count);

        }
    }
}
