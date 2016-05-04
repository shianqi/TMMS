package com.TMMS.Main.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Border;

/**
 * A data access object (DAO) providing persistence and search support for
 * Border entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Border
 * @author MyEclipse Persistence Tools
 */
public class BorderDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(BorderDAO.class);
	// property constants
	public static final String BORDER_TYPE = "borderType";
	public static final String BORDER_REASON = "borderReason";

	public void save(Border transientInstance) {
		log.debug("saving Border instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Border persistentInstance) {
		log.debug("deleting Border instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Border findById(java.lang.Long id) {
		log.debug("getting Border instance with id: " + id);
		try {
			Border instance = (Border) getSession().get(
					"com.TMMS.Main.DAO.Border", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Border instance) {
		log.debug("finding Border instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.bean.Border")
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
		log.debug("finding Border instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Border as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBorderType(Object borderType) {
		return findByProperty(BORDER_TYPE, borderType);
	}

	public List findByBorderReason(Object borderReason) {
		return findByProperty(BORDER_REASON, borderReason);
	}

	public List findAll() {
		log.debug("finding all Border instances");
		try {
			String queryString = "from Border";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Border merge(Border detachedInstance) {
		log.debug("merging Border instance");
		try {
			Border result = (Border) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Border instance) {
		log.debug("attaching dirty Border instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Border instance) {
		log.debug("attaching clean Border instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}