package com.TMMS.Main.DAO;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.UsersTest;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsersTest entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.TMMS.Main.DAO.UsersTest
 * @author MyEclipse Persistence Tools
 */
public class UsersTestDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UsersTestDAO.class);
	// property constants
	public static final String PASSWORD = "password";

	public void save(UsersTest transientInstance) {
		log.debug("saving UsersTest instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsersTest persistentInstance) {
		log.debug("deleting UsersTest instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsersTest findById(java.lang.String id) {
		log.debug("getting UsersTest instance with id: " + id);
		try {
			UsersTest instance = (UsersTest) getSession().get(
					"com.TMMS.Main.DAO.UsersTest", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsersTest instance) {
		log.debug("finding UsersTest instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.DAO.UsersTest")
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
		log.debug("finding UsersTest instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsersTest as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findAll() {
		log.debug("finding all UsersTest instances");
		try {
			String queryString = "from UsersTest";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsersTest merge(UsersTest detachedInstance) {
		log.debug("merging UsersTest instance");
		try {
			UsersTest result = (UsersTest) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsersTest instance) {
		log.debug("attaching dirty UsersTest instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsersTest instance) {
		log.debug("attaching clean UsersTest instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}