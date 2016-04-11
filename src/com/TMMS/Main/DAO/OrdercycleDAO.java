package com.TMMS.Main.DAO;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Ordercycle;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ordercycle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Ordercycle
 * @author MyEclipse Persistence Tools
 */
public class OrdercycleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(OrdercycleDAO.class);
	// property constants
	public static final String OC_CH = "ocCh";

	public void save(Ordercycle transientInstance) {
		log.debug("saving Ordercycle instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ordercycle persistentInstance) {
		log.debug("deleting Ordercycle instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ordercycle findById(java.lang.Long id) {
		log.debug("getting Ordercycle instance with id: " + id);
		try {
			Ordercycle instance = (Ordercycle) getSession().get(
					"com.TMMS.Main.bean.Ordercycle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ordercycle instance) {
		log.debug("finding Ordercycle instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.DAO.Ordercycle")
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
		log.debug("finding Ordercycle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ordercycle as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOcCh(Object ocCh) {
		return findByProperty(OC_CH, ocCh);
	}

	public List findAll() {
		log.debug("finding all Ordercycle instances");
		try {
			String queryString = "from Ordercycle";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ordercycle merge(Ordercycle detachedInstance) {
		log.debug("merging Ordercycle instance");
		try {
			Ordercycle result = (Ordercycle) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ordercycle instance) {
		log.debug("attaching dirty Ordercycle instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ordercycle instance) {
		log.debug("attaching clean Ordercycle instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}