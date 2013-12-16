package com.dp.medical.medicalstore.model.obj.medicalstore;

import java.io.Serializable;
import java.util.Collections;
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

import com.dp.medical.medicalstore.model.obj.medicalstore.iface.IUser;


/** 
 * Object mapping for hibernate-handled table: user.
 * @author autogenerated
 */

@Entity
@Table(name = "user", catalog = "medicalstore")
public class User implements Cloneable, Serializable,  IUser {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558955759L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private String active;
	/** Field mapping. */
	private String address;
	/** Field mapping. */
	private String email;
	/** Field mapping. */
	private String fullname;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String password;
	/** Field mapping. */
	private String phone;
	/** Field mapping. */
	private Set<Purchaseinvoice> purchaseinvoices = new HashSet<Purchaseinvoice>();

	/** Field mapping. */
	private Role roleid;
	/** Field mapping. */
	private Set<Salesinvoice> salesinvoices = new HashSet<Salesinvoice>();

	/** Field mapping. */
	private String username;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public User() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public User(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param fullname String object;
	 * @param id Integer object;
	 * @param password String object;
	 * @param roleid Role object;
	 * @param username String object;
	 */
	public User(String fullname, Integer id, String password, 					
			Role roleid, String username) {

		this.fullname = fullname;
		this.id = id;
		this.password = password;
		this.roleid = roleid;
		this.username = username;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return User.class;
	}
 

    /**
     * Return the value associated with the column: active.
	 * @return A String object (this.active)
	 */
	@Basic( optional = true )
	@Column( length = 5  )
	public String getActive() {
		return this.active;
		
	}
	

  
    /**  
     * Set the value related to the column: active.
	 * @param active the active value you wish to set
	 */
	public void setActive(final String active) {
		this.active = active;
	}

    /**
     * Return the value associated with the column: address.
	 * @return A String object (this.address)
	 */
	@Basic( optional = true )
	@Column( length = 200  )
	public String getAddress() {
		return this.address;
		
	}
	

  
    /**  
     * Set the value related to the column: address.
	 * @param address the address value you wish to set
	 */
	public void setAddress(final String address) {
		this.address = address;
	}

    /**
     * Return the value associated with the column: email.
	 * @return A String object (this.email)
	 */
	@Basic( optional = true )
	@Column( length = 200  )
	public String getEmail() {
		return this.email;
		
	}
	

  
    /**  
     * Set the value related to the column: email.
	 * @param email the email value you wish to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

    /**
     * Return the value associated with the column: fullname.
	 * @return A String object (this.fullname)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 200  )
	public String getFullname() {
		return this.fullname;
		
	}
	

  
    /**  
     * Set the value related to the column: fullname.
	 * @param fullname the fullname value you wish to set
	 */
	public void setFullname(final String fullname) {
		this.fullname = fullname;
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
     * Return the value associated with the column: password.
	 * @return A String object (this.password)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 200  )
	public String getPassword() {
		return this.password;
		
	}
	

  
    /**  
     * Set the value related to the column: password.
	 * @param password the password value you wish to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

    /**
     * Return the value associated with the column: phone.
	 * @return A String object (this.phone)
	 */
	@Basic( optional = true )
	@Column( length = 20  )
	public String getPhone() {
		return this.phone;
		
	}
	

  
    /**  
     * Set the value related to the column: phone.
	 * @param phone the phone value you wish to set
	 */
	public void setPhone(final String phone) {
		this.phone = phone;
	}

    /**
     * Return the value associated with the column: purchaseinvoice.
	 * @return A Set&lt;Purchaseinvoice&gt; object (this.purchaseinvoice)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "userid"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Purchaseinvoice> getPurchaseinvoices() {
		return this.purchaseinvoices;
		
	}
	
	/**
	 * Adds a bi-directional link of type Purchaseinvoice to the purchaseinvoices set.
	 * @param purchaseinvoice item to add
	 */
	public void addPurchaseinvoice(Purchaseinvoice purchaseinvoice) {
		purchaseinvoice.setUserid(this);
		this.purchaseinvoices.add(purchaseinvoice);
	}

  
    /**  
     * Set the value related to the column: purchaseinvoice.
	 * @param purchaseinvoice the purchaseinvoice value you wish to set
	 */
	public void setPurchaseinvoices(final Set<Purchaseinvoice> purchaseinvoice) {
		this.purchaseinvoices = purchaseinvoice;
	}

    /**
     * Return the value associated with the column: roleid.
	 * @return A Role object (this.roleid)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "RoleId", nullable = false )
	public Role getRoleid() {
		return this.roleid;
		
	}
	

  
    /**  
     * Set the value related to the column: roleid.
	 * @param roleid the roleid value you wish to set
	 */
	public void setRoleid(final Role roleid) {
		this.roleid = roleid;
	}

    /**
     * Return the value associated with the column: salesinvoice.
	 * @return A Set&lt;Salesinvoice&gt; object (this.salesinvoice)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "userid"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<Salesinvoice> getSalesinvoices() {
		return this.salesinvoices;
		
	}
	
	/**
	 * Adds a bi-directional link of type Salesinvoice to the salesinvoices set.
	 * @param salesinvoice item to add
	 */
	public void addSalesinvoice(Salesinvoice salesinvoice) {
		salesinvoice.setUserid(this);
		this.salesinvoices.add(salesinvoice);
	}

  
    /**  
     * Set the value related to the column: salesinvoice.
	 * @param salesinvoice the salesinvoice value you wish to set
	 */
	public void setSalesinvoices(final Set<Salesinvoice> salesinvoice) {
		this.salesinvoices = salesinvoice;
	}

    /**
     * Return the value associated with the column: username.
	 * @return A String object (this.username)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 200  )
	public String getUsername() {
		return this.username;
		
	}
	

  
    /**  
     * Set the value related to the column: username.
	 * @param username the username value you wish to set
	 */
	public void setUsername(final String username) {
		this.username = username;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public User clone() throws CloneNotSupportedException {
		
        final User copy = (User)super.clone();

		copy.setActive(this.getActive());
		copy.setAddress(this.getAddress());
		copy.setEmail(this.getEmail());
		copy.setFullname(this.getFullname());
		copy.setId(this.getId());
		copy.setPassword(this.getPassword());
		copy.setPhone(this.getPhone());
		if (this.getPurchaseinvoices() != null) {
			copy.getPurchaseinvoices().addAll(this.getPurchaseinvoices());
		}
		copy.setRoleid(this.getRoleid());
		if (this.getSalesinvoices() != null) {
			copy.getSalesinvoices().addAll(this.getSalesinvoices());
		}
		copy.setUsername(this.getUsername());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("active: " + this.getActive() + ", ");
		sb.append("address: " + this.getAddress() + ", ");
		sb.append("email: " + this.getEmail() + ", ");
		sb.append("fullname: " + this.getFullname() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("password: " + this.getPassword() + ", ");
		sb.append("phone: " + this.getPhone() + ", ");
		sb.append("username: " + this.getUsername());
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
		
		final User that; 
		try {
			that = (User) proxyThat;
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
		result = result && (((getActive() == null) && (that.getActive() == null)) || (getActive() != null && getActive().equals(that.getActive())));
		result = result && (((getAddress() == null) && (that.getAddress() == null)) || (getAddress() != null && getAddress().equals(that.getAddress())));
		result = result && (((getEmail() == null) && (that.getEmail() == null)) || (getEmail() != null && getEmail().equals(that.getEmail())));
		result = result && (((getFullname() == null) && (that.getFullname() == null)) || (getFullname() != null && getFullname().equals(that.getFullname())));
		result = result && (((getPassword() == null) && (that.getPassword() == null)) || (getPassword() != null && getPassword().equals(that.getPassword())));
		result = result && (((getPhone() == null) && (that.getPhone() == null)) || (getPhone() != null && getPhone().equals(that.getPhone())));
		result = result && (((getRoleid() == null) && (that.getRoleid() == null)) || (getRoleid() != null && getRoleid().getId().equals(that.getRoleid().getId())));	
		result = result && (((getUsername() == null) && (that.getUsername() == null)) || (getUsername() != null && getUsername().equals(that.getUsername())));
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