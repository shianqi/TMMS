package com.TMMS.Main.DAO;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Bo;

/**
 * A data access object (DAO) providing persistence and search support for Bo
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Bo
 * @author MyEclipse Persistence Tools
 */
public class BoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(BoDAO.class);
	// property constants
	public static final String BO_NUMBER = "boNumber";

	public void save(Bo transientInstance) {
		log.debug("saving Bo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bo persistentInstance) {
		log.debug("deleting Bo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bo findById(com.TMMS.Main.bean.BoId id) {
		log.debug("getting Bo instance with id: " + id);
		try {
			Bo instance = (Bo) getSession().get("com.TMMS.Main.bean.Bo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bo instance) {
		log.debug("finding Bo instance by example");
		try {
			List results = getSession().createCriteria("com.TMMS.Main.bean.Bo")
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
		log.debug("finding Bo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bo as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBoNumber(Object boNumber) {
		return findByProperty(BO_NUMBER, boNumber);
	}

	public List findAll() {
		log.debug("finding all Bo instances");
		try {
			String queryString = "from Bo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bo merge(Bo detachedInstance) {
		log.debug("merging Bo instance");
		try {
			Bo result = (Bo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bo instance) {
		log.debug("attaching dirty Bo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bo instance) {
		log.debug("attaching clean Bo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}