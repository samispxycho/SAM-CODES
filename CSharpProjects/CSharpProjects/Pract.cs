using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Schema;

namespace CSharpProjects
{
  
    class A
    {
        private string name;
        
        public string data
        {
            set
            {
                name = value;
            }

            get
            {
                return name;
            }

        }
        

    }
    internal class Pract
    {
        static void Main(string[] args)
        {
            A obj = new A();
            obj.data = "sameer";
            string str = obj.data;
            Console.WriteLine(str);
        }  
    }
}
