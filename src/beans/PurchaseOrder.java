/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.sql.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gina PC
 */
@XmlRootElement(name="purchase")
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrder implements Serializable {
    @XmlElement(required=true)
    private int poid;
    @XmlElement(required=true)
    private String dateordered;
    @XmlElement(required=true)
    private String status;
    
    public PurchaseOrder(){
    }  
    
    public PurchaseOrder(String dateordered, String status) {
        this.dateordered = dateordered;
        this.status = status;
    }
    
    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public String getDateordered() {
        return dateordered;
    }

    public void setDateordered(String dateordered) {
        this.dateordered = dateordered;
    }
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
