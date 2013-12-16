package com.dp.medical.medicalstore.model.obj.medicalstore.iface;
import java.util.Set;

import com.dp.medical.medicalstore.model.obj.medicalstore.Customerrelationship;
import com.dp.medical.medicalstore.model.obj.medicalstore.Customertype;
import com.dp.medical.medicalstore.model.obj.medicalstore.Salesinvoice;


/** 
 * Object interface mapping for hibernate-handled table: customer.
 * @author autogenerated
 */

public interface ICustomer {



    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	String getAddress();
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	void setAddress(final String address);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	String getName();
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	void setName(final String name);

    /**
     * Return the value associated with the column: phone.
	 * @return A String object (this.phone)
	 */
	String getPhone();
	

  
    /**  
     * Set the value related to the column: phone.
	 * @param phone the phone value you wish to set
	 */
	void setPhone(final String phone);

    /**
     * Return the value associated with the column: relationshipid.
	 * @return A Customerrelationship object (this.relationshipid)
	 */
	Customerrelationship getRelationshipid();
	

  
    /**  
     * Set the value related to the column: relationshipid.
	 * @param relationshipid the relationshipid value you wish to set
	 */
	void setRelationshipid(final Customerrelationship relationshipid);

    /**
     * Return the value associated with the column: salesinvoice.
	 * @return A Set&lt;Salesinvoice&gt; object (this.salesinvoice)
	 */
	Set<Salesinvoice> getSalesinvoices();
	
	/**
	 * Adds a bi-directional link of type Salesinvoice to the salesinvoices set.
	 * @param salesinvoice item to add
	 */
	void addSalesinvoice(Salesinvoice salesinvoice);

  
    /**  
     * Set the value related to the column: salesinvoice.
	 * @param salesinvoice the salesinvoice value you wish to set
	 */
	void setSalesinvoices(final Set<Salesinvoice> salesinvoice);

    /**
     * Return the value associated with the column: typeid.
	 * @return A Customertype object (this.typeid)
	 */
	Customertype getTypeid();
	

  
    /**  
     * Set the value related to the column: typeid.
	 * @param typeid the typeid value you wish to set
	 */
	void setTypeid(final Customertype typeid);

	// end of interface
}