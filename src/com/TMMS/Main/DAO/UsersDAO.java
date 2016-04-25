package com.TMMS.Main.DAO;

import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Users;

/**
 * A data access object (DAO) providing persistence and search support for Users
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.TMMS.Main.bean.Users
 * @author MyEclipse Persistence Tools
 */
public class UsersDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(UsersDAO.class);
	// property constants
	public static final String _UPWD = "UPwd";
	public static final String _UNAME = "UName";
	public static final String _UEMAIL = "UEmail";
	public static final String _UPHONE = "UPhone";
	public static final String _UPT = "UPT";
	public static final String _UPC = "UPC";
	public static final String _UPB = "UPB";
	public static final String _UPF = "UPF";
	public static final String _UPS = "UPS";
	public static final String _USTATE = "UState";

	public void save(Users transientInstance) {
		log.debug("saving Users instance");
		Transaction transaction= getSession().beginTransaction();
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		transaction.commit();
		getSession().close();
	}

	public void delete(Users persistentInstance) {
		log.debug("deleting Users instance");
		Transaction transaction= getSession().beginTransaction();
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
		transaction.commit();
		getSession().close();
	}

	public Users findById(java.lang.Long id) {
		log.debug("getting Users instance with id: " + id);
		try {
			Users instance = (Users) getSession().get(
					"com.TMMS.Main.bean.Users", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Users instance) {
		log.debug("finding Users instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.bean.Users")
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
		log.debug("finding Users instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Users as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List findByKeyword(String keyword){
		try {
			Long uidLong;
			try {
				uidLong = Long.parseLong(keyword);
			} catch (Exception e) {
				String queryString = "from Users as model where"
						+ " model.UName  like ? or"
						+ " model.UPhone like ? or"
						+ " model.UEmail like ? ";
				Query queryObject = getSession().createQuery(queryString);
				queryObject.setParameter(0, (Object)("%"+keyword+"%"));
				queryObject.setParameter(1, (Object)("%"+keyword+"%"));
				queryObject.setParameter(2, (Object)("%"+keyword+"%"));
				return queryObject.list();
			}
			String queryString = "from Users as model where"
					+ " model.UName  like ? or"
					+ " model.UPhone like ? or"
					+ " model.UId    like '%"+uidLong+"%' or"
					+ " model.UEmail like ? ";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, (Object)("%"+keyword+"%"));
			queryObject.setParameter(1, (Object)("%"+keyword+"%"));
			queryObject.setParameter(2, (Object)("%"+keyword+"%"));
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUPwd(Object UPwd) {
		return findByProperty(_UPWD, UPwd);
	}

	public List findByUName(Object UName) {
		return findByProperty(_UNAME, UName);
	}

	public List findByUEmail(Object UEmail) {
		return findByProperty(_UEMAIL, UEmail);
	}

	public List findByUPhone(Object UPhone) {
		return findByProperty(_UPHONE, UPhone);
	}

	public List findByUPT(Object UPT) {
		return findByProperty(_UPT, UPT);
	}

	public List findByUPC(Object UPC) {
		return findByProperty(_UPC, UPC);
	}

	public List findByUPB(Object UPB) {
		return findByProperty(_UPB, UPB);
	}

	public List findByUPF(Object UPF) {
		return findByProperty(_UPF, UPF);
	}

	public List findByUPS(Object UPS) {
		return findByProperty(_UPS, UPS);
	}

	public List findByUState(Object UState) {
		return findByProperty(_USTATE, UState);
	}

	public List findAll() {
		log.debug("finding all Users instances");
		try {
			String queryString = "from Users";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Users merge(Users detachedInstance) {
		log.debug("merging Users instance");
		try {
			Users result = (Users) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Users instance) {
		log.debug("attaching dirty Users instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Users instance) {
		log.debug("attaching clean Users instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}