//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.10 at 04:23:20 PM CET 
//


package xml.ftn.centralnabanka;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MT102Response" type="{http://www.ftn.xml/centralnabanka}MT102Response"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mt102Response"
})
@XmlRootElement(name = "sendMT102Response")
public class SendMT102Response {

    @XmlElement(name = "MT102Response", required = true)
    protected MT102Response mt102Response;

    /**
     * Gets the value of the mt102Response property.
     * 
     * @return
     *     possible object is
     *     {@link MT102Response }
     *     
     */
    public MT102Response getMT102Response() {
        return mt102Response;
    }

    /**
     * Sets the value of the mt102Response property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT102Response }
     *     
     */
    public void setMT102Response(MT102Response value) {
        this.mt102Response = value;
    }

}
