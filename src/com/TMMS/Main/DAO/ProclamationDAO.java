package com.TMMS.Main.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Proclamation;

/**
 * A data access object (DAO) providing persistence and search support for
 * Proclamation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Proclamation
 * @author MyEclipse Persistence Tools
 */
public class ProclamationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ProclamationDAO.class);
	// property constants
	public static final String _PTEXT = "PText";

	public void save(Proclamation transientInstance) {
		log.debug("saving Proclamation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Proclamation persistentInstance) {
		log.debug("deleting Proclamation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Proclamation findById(java.lang.Long id) {
		log.debug("getting Proclamation instance with id: " + id);
		try {
			Proclamation instance = (Proclamation) getSession().get(
					"com.TMMS.Main.DAO.Proclamation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Proclamation instance) {
		log.debug("finding Proclamation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.DAO.Proclamation")
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
		log.debug("finding Proclamation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Proclamation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPText(Object PText) {
		return findByProperty(_PTEXT, PText);
	}

	public List findAll() {
		log.debug("finding all Proclamation instances");
		try {
			String queryString = "from Proclamation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Proclamation merge(Proclamation detachedInstance) {
		log.debug("merging Proclamation instance");
		try {
			Proclamation result = (Proclamation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Proclamation instance) {
		log.debug("attaching dirty Proclamation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Proclamation instance) {
		log.debug("attaching clean Proclamation instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}