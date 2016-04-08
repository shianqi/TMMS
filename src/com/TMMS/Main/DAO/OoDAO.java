package com.TMMS.Main.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Oo;

/**
 * A data access object (DAO) providing persistence and search support for Oo
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Oo
 * @author MyEclipse Persistence Tools
 */
public class OoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(OoDAO.class);
	// property constants
	public static final String OO_ID = "ooId";
	public static final String OO_TYPE = "ooType";
	public static final String OO_REASON = "ooReason";

	public void save(Oo transientInstance) {
		log.debug("saving Oo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Oo persistentInstance) {
		log.debug("deleting Oo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Oo findById(com.TMMS.Main.bean.OoId id) {
		log.debug("getting Oo instance with id: " + id);
		try {
			Oo instance = (Oo) getSession().get("com.TMMS.Main.DAO.Oo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Oo instance) {
		log.debug("finding Oo instance by example");
		try {
			List results = getSession().createCriteria("com.TMMS.Main.DAO.Oo")
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
		log.debug("finding Oo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Oo as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOoId(Object ooId) {
		return findByProperty(OO_ID, ooId);
	}

	public List findByOoType(Object ooType) {
		return findByProperty(OO_TYPE, ooType);
	}

	public List findByOoReason(Object ooReason) {
		return findByProperty(OO_REASON, ooReason);
	}

	public List findAll() {
		log.debug("finding all Oo instances");
		try {
			String queryString = "from Oo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Oo merge(Oo detachedInstance) {
		log.debug("merging Oo instance");
		try {
			Oo result = (Oo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Oo instance) {
		log.debug("attaching dirty Oo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Oo instance) {
		log.debug("attaching clean Oo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}