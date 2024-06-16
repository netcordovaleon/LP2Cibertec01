using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

// NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
public class Service : IService
{
    public const string DNI = "DNI";

    IList<PersonaModel> list = new List<PersonaModel>();

    public Service()
    {
        list.Add(new PersonaModel()
        {
            Id = 1,
            FullName = "Luis Alex",
            LastName = "Cordova Leon",
            DocumentType = DNI,
            DocumentNumber = "12345678",
            DateOfBirthday = DateTime.Now.ToString("dd/MM/yyyy")
        });

        list.Add(new PersonaModel()
        {
            Id = 2,
            FullName = "Jorge",
            LastName = "Soto Lopez",
            DocumentType = DNI,
            DocumentNumber = "87654321",
            DateOfBirthday = DateTime.Now.ToString("dd/MM/yyyy")
        });

        list.Add(new PersonaModel()
        {
            Id = 3,
            FullName = "Liseht",
            LastName = "Gomez",
            DocumentType = DNI,
            DocumentNumber = "85296312",
            DateOfBirthday = DateTime.Now.ToString("dd/MM/yyyy")
        });

    }

    public PersonaModel GetPersonInformationByDni(string dni)
    {
        var result = list.Where(c => c.DocumentNumber == dni).SingleOrDefault();
        return result;
    }
}
