package com.shq.entity;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A data access object (DAO) providing persistence and search support for Admin
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.shq.entity.Admin
 * @author MyEclipse Persistence Tools
 */
public class AdminDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AdminDAO.class);
	// property constants
	public static final String ADMIN_NAME = "adminName";
	public static final String ADMIN_PASS = "adminPass";
	public static final String ADMIN_IDENTITY = "adminIdentity";
	public static final String ADMIN_SEX = "adminSex";
	public static final String ADMIN_AGE = "adminAge";
	public static final String ADMIN_IDCARD = "adminIdcard";
	public static final String ADMIN_EMAIL = "adminEmail";
	public static final String ADMIN_TELEPHONE = "adminTelephone";
	public static final String ADMIN_ADDRESS = "adminAddress";

	public void save(Admin transientInstance) {
		log.debug("saving Admin instance");
		try {
			getSession().save(transientInstance);
			getSession().flush();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Admin persistentInstance) {
		log.debug("deleting Admin instance");
		try {
			getSession().delete(persistentInstance);
			getSession().flush();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Admin findById(java.lang.Integer id) {
		log.debug("getting Admin instance with id: " + id);
		try {
			Admin instance = (Admin) getSession().get("com.shq.entity.Admin",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Admin instance) {
		log.debug("finding Admin instance by example");
		try {
			List results = getSession().createCriteria("com.shq.entity.Admin")
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
		log.debug("finding Admin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Admin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAdminName(Object adminName) {
		return findByProperty(ADMIN_NAME, adminName);
	}

	public List findByAdminPass(Object adminPass) {
		return findByProperty(ADMIN_PASS, adminPass);
	}

	public List findByAdminIdentity(Object adminIdentity) {
		return findByProperty(ADMIN_IDENTITY, adminIdentity);
	}

	public List findByAdminSex(Object adminSex) {
		return findByProperty(ADMIN_SEX, adminSex);
	}

	public List findByAdminAge(Object adminAge) {
		return findByProperty(ADMIN_AGE, adminAge);
	}

	public List findByAdminIdcard(Object adminIdcard) {
		return findByProperty(ADMIN_IDCARD, adminIdcard);
	}

	public List findByAdminEmail(Object adminEmail) {
		return findByProperty(ADMIN_EMAIL, adminEmail);
	}

	public List findByAdminTelephone(Object adminTelephone) {
		return findByProperty(ADMIN_TELEPHONE, adminTelephone);
	}

	public List findByAdminAddress(Object adminAddress) {
		return findByProperty(ADMIN_ADDRESS, adminAddress);
	}

	public List findAll() {
		log.debug("finding all Admin instances");
		try {
			String queryString = "from Admin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Admin merge(Admin detachedInstance) {
		log.debug("merging Admin instance");
		try {
			Admin result = (Admin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Admin instance) {
		log.debug("attaching dirty Admin instance");
		try {
			getSession().saveOrUpdate(instance);
			getSession().flush();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Admin instance) {
		log.debug("attaching clean Admin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public Admin loginAdmin(String adminName, String adminPass) {
		// TODO Auto-generated method stub
		 String queryString = "from Admin as admin where admin.adminName = ? and admin.adminPass=?";
	     Query queryObject = getSession().createQuery(queryString);
	     queryObject.setParameter(0, adminName);
	     queryObject.setParameter(1, adminPass);
	     List<Admin> list = new ArrayList<Admin>();
	     list = queryObject.list();
	     if(list.size()!=0){
	    	 Admin admin = list.get(0);
	    	 return admin;
	     }else{
	    	 return null;
	     }
	    
	}
	public Admin loginAdmin(Admin admin){
		String adminName = admin.getAdminName();
		String adminPass = admin.getAdminPass();
		return loginAdmin(adminName,adminPass);
		
	}
}