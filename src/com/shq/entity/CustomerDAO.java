package com.shq.entity;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.shq.entity.Customer
 * @author MyEclipse Persistence Tools
 */
public class CustomerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CustomerDAO.class);
	// property constants
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_PASS = "customerPass";
	public static final String CUSTOMER_IDENTITY = "customerIdentity";
	public static final String CUSTOMER_SEX = "customerSex";
	public static final String CUSTOMER_AGE = "customerAge";
	public static final String CUSTOMER_IDCARD = "customerIdcard";
	public static final String CUSTOMER_EMAIL = "customerEmail";
	public static final String CUSTOMER_TELEPHONE = "customerTelephone";
	public static final String CUSTOMER_ADDRESS = "customerAddress";

	public void save(Customer transientInstance) {
		log.debug("saving Customer instance");
		try {
			getSession().save(transientInstance);
			getSession().flush();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Customer persistentInstance) {
		log.debug("deleting Customer instance");
		try {
			getSession().delete(persistentInstance);
			getSession().flush();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Customer findById(java.lang.Integer id) {
		log.debug("getting Customer instance with id: " + id);
		try {
			Customer instance = (Customer) getSession().get(
					"com.shq.entity.Customer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Customer instance) {
		log.debug("finding Customer instance by example");
		try {
			List results = getSession()
					.createCriteria("com.shq.entity.Customer")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Customer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Customer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	public List findByCustomerPass(Object customerPass) {
		return findByProperty(CUSTOMER_PASS, customerPass);
	}

	public List findByCustomerIdentity(Object customerIdentity) {
		return findByProperty(CUSTOMER_IDENTITY, customerIdentity);
	}

	public List findByCustomerSex(Object customerSex) {
		return findByProperty(CUSTOMER_SEX, customerSex);
	}

	public List findByCustomerAge(Object customerAge) {
		return findByProperty(CUSTOMER_AGE, customerAge);
	}

	public List findByCustomerIdcard(Object customerIdcard) {
		return findByProperty(CUSTOMER_IDCARD, customerIdcard);
	}

	public List findByCustomerEmail(Object customerEmail) {
		return findByProperty(CUSTOMER_EMAIL, customerEmail);
	}

	public List findByCustomerTelephone(Object customerTelephone) {
		return findByProperty(CUSTOMER_TELEPHONE, customerTelephone);
	}

	public List findByCustomerAddress(Object customerAddress) {
		return findByProperty(CUSTOMER_ADDRESS, customerAddress);
	}

	public List findAll() {
		log.debug("finding all Customer instances");
		try {
			String queryString = "from Customer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Customer merge(Customer detachedInstance) {
		log.debug("merging Customer instance");
		try {
			Customer result = (Customer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Customer instance) {
		log.debug("attaching dirty Customer instance");
		try {
			getSession().saveOrUpdate(instance);
			getSession().flush();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Customer instance) {
		log.debug("attaching clean Customer instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public Customer loginCustomer(String customerName, String customerPass) {
		// TODO Auto-generated method stub
		 String queryString = "from Customer as customer where customer.customerName = ? and customer.customerPass=?";
	     Query queryObject = getSession().createQuery(queryString);
	     queryObject.setParameter(0, customerName);
	     queryObject.setParameter(1, customerPass);
	     List<Customer> list = new ArrayList<Customer>();
	     list = queryObject.list();
	     if(list.size()!=0){
	    	 Customer customer = list.get(0);
	    	 return customer;
	     }else{
	    	 return null;
	     }
	    
	}
	public Customer loginCustomer(Customer customer){
		String customerName = customer.getCustomerName();
		String customerPass = customer.getCustomerPass();
		return loginCustomer(customerName,customerPass);
		
	}
}