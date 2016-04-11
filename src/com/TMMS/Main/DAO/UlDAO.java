package com.TMMS.Main.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Ul;

/**
 * A data access object (DAO) providing persistence and search support for Ul
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Ul
 * @author MyEclipse Persistence Tools
 */
public class UlDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(UlDAO.class);
	// property constants
	public static final String UL_IP = "ulIp";
	public static final String UL_LOCATION = "ulLocation";

	public void save(Ul transientInstance) {
		log.debug("saving Ul instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ul persistentInstance) {
		log.debug("deleting Ul instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ul findById(java.lang.Long id) {
		log.debug("getting Ul instance with id: " + id);
		try {
			Ul instance = (Ul) getSession().get("com.TMMS.Main.bean.Ul", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ul instance) {
		log.debug("finding Ul instance by example");
		try {
			List results = getSession().createCriteria("com.TMMS.Main.bean.Ul")
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
		log.debug("finding Ul instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ul as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUlIp(Object ulIp) {
		return findByProperty(UL_IP, ulIp);
	}

	public List findByUlLocation(Object ulLocation) {
		return findByProperty(UL_LOCATION, ulLocation);
	}

	public List findAll() {
		log.debug("finding all Ul instances");
		try {
			String queryString = "from Ul";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ul merge(Ul detachedInstance) {
		log.debug("merging Ul instance");
		try {
			Ul result = (Ul) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ul instance) {
		log.debug("attaching dirty Ul instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ul instance) {
		log.debug("attaching clean Ul instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}