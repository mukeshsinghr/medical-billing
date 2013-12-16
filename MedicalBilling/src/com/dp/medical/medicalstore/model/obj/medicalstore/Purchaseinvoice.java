package com.dp.medical.medicalstore.model.obj.medicalstore;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.proxy.HibernateProxy;

import com.dp.medical.medicalstore.model.obj.medicalstore.iface.IPurchaseinvoice;


/** 
 * Object mapping for hibernate-handled table: purchaseinvoice.
 * @author autogenerated
 */

@Entity
@Table(name = "purchaseinvoice", catalog = "medicalstore")
public class Purchaseinvoice implements Cloneable, Serializable,  IPurchaseinvoice {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558955766L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Date date;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Double paymented;
	/** Field mapping. */
	private Set<Purchaseinvoicedetails> purchaseinvoicedetailss = new HashSet<Purchaseinvoicedetails>();

	/** Field mapping. */
	private Double subtotal;
	/** Field mapping. */
	private Supplier supplierid;
	/** Field mapping. */
	private Double tax;
	/** Field mapping. */
	private User userid;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Purchaseinvoice() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Purchaseinvoice(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param date Date object;
	 * @param id Integer object;
	 * @param paymented Double object;
	 * @param subtotal Double object;
	 * @param supplierid Supplier object;
	 * @param tax Double object;
	 * @param userid User object;
	 */
	public Purchaseinvoice(Date date, Integer id, Double paymented, 					
			Double subtotal, Supplier supplierid, Double tax, 					
			User userid) {

		this.date = date;
		this.id = id;
		this.paymented = paymented;
		this.subtotal = subtotal;
		this.supplierid = supplierid;
		this.tax = tax;
		this.userid = userid;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Purchaseinvoice.class;
	}
 

    /**
     * Return the value associated with the column: date.
	 * @return A Date object (this.date)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Date getDate() {
		return this.date;
		
	}
	

  
    /**  
     * Set the value related to the column: date.
	 * @param date the date value you wish to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: paymented.
	 * @return A Double object (this.paymented)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Double getPaymented() {
		return this.paymented;
		
	}
	

  
    /**  
     * Set the value related to the column: paymented.
	 * @param paymented the paymented value you wish to set
	 */
	public void setPaymented(final Double paymented) {
		this.paymented = paymented;
	}

    /**
     * Return the value associated with the column: purchaseinvoicedetails.
	 * @return A Set&lt;Purchaseinvoicedetails&gt; object (this.purchaseinvoicedetails)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "purchaseinvoiceid"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Purchaseinvoicedetails> getPurchaseinvoicedetailss() {
		return this.purchaseinvoicedetailss;
		
	}
	
	/**
	 * Adds a bi-directional link of type Purchaseinvoicedetails to the purchaseinvoicedetailss set.
	 * @param purchaseinvoicedetails item to add
	 */
	public void addPurchaseinvoicedetails(Purchaseinvoicedetails purchaseinvoicedetails) {
		purchaseinvoicedetails.setPurchaseinvoiceid(this);
		this.purchaseinvoicedetailss.add(purchaseinvoicedetails);
	}

  
    /**  
     * Set the value related to the column: purchaseinvoicedetails.
	 * @param purchaseinvoicedetails the purchaseinvoicedetails value you wish to set
	 */
	public void setPurchaseinvoicedetailss(final Set<Purchaseinvoicedetails> purchaseinvoicedetails) {
		this.purchaseinvoicedetailss = purchaseinvoicedetails;
	}

    /**
     * Return the value associated with the column: subtotal.
	 * @return A Double object (this.subtotal)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Double getSubtotal() {
		return this.subtotal;
		
	}
	

  
    /**  
     * Set the value related to the column: subtotal.
	 * @param subtotal the subtotal value you wish to set
	 */
	public void setSubtotal(final Double subtotal) {
		this.subtotal = subtotal;
	}

    /**
     * Return the value associated with the column: supplierid.
	 * @return A Supplier object (this.supplierid)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "SupplierId", nullable = false )
	public Supplier getSupplierid() {
		return this.supplierid;
		
	}
	

  
    /**  
     * Set the value related to the column: supplierid.
	 * @param supplierid the supplierid value you wish to set
	 */
	public void setSupplierid(final Supplier supplierid) {
		this.supplierid = supplierid;
	}

    /**
     * Return the value associated with the column: tax.
	 * @return A Double object (this.tax)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Double getTax() {
		return this.tax;
		
	}
	

  
    /**  
     * Set the value related to the column: tax.
	 * @param tax the tax value you wish to set
	 */
	public void setTax(final Double tax) {
		this.tax = tax;
	}

    /**
     * Return the value associated with the column: userid.
	 * @return A User object (this.userid)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "UserId", nullable = false )
	public User getUserid() {
		return this.userid;
		
	}
	

  
    /**  
     * Set the value related to the column: userid.
	 * @param userid the userid value you wish to set
	 */
	public void setUserid(final User userid) {
		this.userid = userid;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Purchaseinvoice clone() throws CloneNotSupportedException {
		
        final Purchaseinvoice copy = (Purchaseinvoice)super.clone();

		copy.setDate(this.getDate());
		copy.setId(this.getId());
		copy.setPaymented(this.getPaymented());
		if (this.getPurchaseinvoicedetailss() != null) {
			copy.getPurchaseinvoicedetailss().addAll(this.getPurchaseinvoicedetailss());
		}
		copy.setSubtotal(this.getSubtotal());
		copy.setSupplierid(this.getSupplierid());
		copy.setTax(this.getTax());
		copy.setUserid(this.getUserid());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("date: " + this.getDate() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("paymented: " + this.getPaymented() + ", ");
		sb.append("subtotal: " + this.getSubtotal() + ", ");
		sb.append("tax: " + this.getTax() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Purchaseinvoice that; 
		try {
			that = (Purchaseinvoice) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getDate() == null) && (that.getDate() == null)) || (getDate() != null && getDate().equals(that.getDate())));
		result = result && (((getPaymented() == null) && (that.getPaymented() == null)) || (getPaymented() != null && getPaymented().equals(that.getPaymented())));
		result = result && (((getSubtotal() == null) && (that.getSubtotal() == null)) || (getSubtotal() != null && getSubtotal().equals(that.getSubtotal())));
		result = result && (((getSupplierid() == null) && (that.getSupplierid() == null)) || (getSupplierid() != null && getSupplierid().getId().equals(that.getSupplierid().getId())));	
		result = result && (((getTax() == null) && (that.getTax() == null)) || (getTax() != null && getTax().equals(that.getTax())));
		result = result && (((getUserid() == null) && (that.getUserid() == null)) || (getUserid() != null && getUserid().getId().equals(that.getUserid().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}