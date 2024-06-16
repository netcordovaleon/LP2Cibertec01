using System.Runtime.Serialization;
using System.ServiceModel;


// NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de interfaz "IService1" en el código y en el archivo de configuración a la vez.
[ServiceContract]
public interface IService
{
    [OperationContract]
    PersonaModel GetPersonInformationByDni(string dni);
}

