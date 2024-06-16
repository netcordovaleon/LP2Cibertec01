using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

/// <summary>
/// Descripción breve de PersonaModel
/// </summary>
[DataContract]
public class PersonaModel
{
    [DataMember(Name = "Code")]
    public int Id { get; set; }
    [DataMember]
    public string FullName { get; set; }
    [DataMember]
    public string LastName { get; set; }
    [DataMember (Order = 1)]
    public string DocumentType { get; set; }
    [DataMember (Order = 2)]
    public string DocumentNumber { get; set; }
    [DataMember]
    public string DateOfBirthday { get; set; }

    public PersonaModel()
    {
       
    }
}