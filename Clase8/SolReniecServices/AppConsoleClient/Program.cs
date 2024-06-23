using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppConsoleClient
{
    internal class Program
    {
        static void Main(string[] args)
        {

            ServicioReniec.ServiceClient client = new ServicioReniec.ServiceClient();

            var respuesta =  client.GetPersonInformationByDni("12345678");

            Console.ReadLine();
        }
    }
}
