
package LeukePrefix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="getal1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="getal2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="getal3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "request", namespace = "http://schemas.hu.fnt.nl/berichten/request", propOrder = {

})
public class Request {

    @XmlElement(name = "getal1")
    protected int getal1;
    @XmlElement(name = "getal2")
    protected int getal2;
    @XmlElement(name = "getal3")
    protected int getal3;

    public int getGetal1() {
        return getal1;
    }
    public void setGetal1(int value) {
        this.getal1 = value;
    }

    public int getGetal2() {
        return getal2;
    }
    public void setGetal2(int value) {
        this.getal2 = value;
    }

    public int getGetal3() { return getal3; }
    public void setGetal3(int value) { this.getal3 = value; }

}
