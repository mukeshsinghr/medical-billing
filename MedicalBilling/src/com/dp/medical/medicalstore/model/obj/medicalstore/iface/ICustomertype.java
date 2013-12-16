package com.dp.medical.medicalstore.model.obj.medicalstore.iface;
import com.dp.medical.medicalstore.model.obj.medicalstore.Customer;
import java.util.Set;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: customertype.
 * @author autogenerated
 */

public interface ICustomertype {



    /**
     * Return the value associated with the column: customer.
	 * @return A Set&lt;Customer&gt; object (this.customer)
	 */
	Set<Customer> getCustomers();
	
	/**
	 * Adds a bi-directional link of type Customer to the customers set.
	 * @param customer item to add
	 */
	void addCustomer(Customer customer);

  
    /**  
     * Set the value related to the column: customer.
	 * @param customer the customer value you wish to set
	 */
	void setCustomers(final Set<Customer> customer);

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

	// end of interface
}