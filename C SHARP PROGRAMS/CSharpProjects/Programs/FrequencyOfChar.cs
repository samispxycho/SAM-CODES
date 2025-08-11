using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpProjects
{
    internal class FrequencyOfChar
    {
        static void Main(string[] args)
        {
            string str = "graphicerauniversity";
            Dictionary<char,int> hm = new Dictionary<char,int>();
            foreach(char c in str)
            {
                if (hm.ContainsKey(c))
                {
                    hm[c]++;
                }
                else hm[c] = 1;
            }
            foreach (var kvp in hm)
            {
                Console.WriteLine($"Character: '{kvp.Key}', Frequency: {kvp.Value}");
            }
        }
    }
}
