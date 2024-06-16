//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.7 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.15 a las 09:50:31 PM PET 
//


package com.cibertec.springproject.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetPersonInformationByDniResult" type="{http://schemas.datacontract.org/2004/07/}PersonaModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPersonInformationByDniResult"
})
@XmlRootElement(name = "GetPersonInformationByDniResponse")
public class GetPersonInformationByDniResponse {

    @XmlElementRef(name = "GetPersonInformationByDniResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonaModel> getPersonInformationByDniResult;

    /**
     * Obtiene el valor de la propiedad getPersonInformationByDniResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonaModel }{@code >}
     *     
     */
    public JAXBElement<PersonaModel> getGetPersonInformationByDniResult() {
        return getPersonInformationByDniResult;
    }

    /**
     * Define el valor de la propiedad getPersonInformationByDniResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonaModel }{@code >}
     *     
     */
    public void setGetPersonInformationByDniResult(JAXBElement<PersonaModel> value) {
        this.getPersonInformationByDniResult = value;
    }

}
