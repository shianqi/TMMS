package com.TMMS.Main.DAO;

import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.TMMS.Main.bean.Books;
import com.TMMS.Main.bean.Border;

/**
 * A data access object (DAO) providing persistence and search support for Books
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.TMMS.Main.DAO.Books
 * @author MyEclipse Persistence Tools
 */
public class BooksDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(BooksDAO.class);
	// property constants
	public static final String _BNAME = "BName";
	public static final String _BAUTHOR = "BAuthor";
	public static final String _BPRICE = "BPrice";
	public static final String _BISBN = "BIsbn";
	public static final String _BPRESS = "BPress";
	public static final String _BORDER = "BOrder";
	public static final String _BPLAN = "BPlan";
	public static final String _BBORDERS = "BBorders";
	public static final String _BGRAND = "BGrand";
	public static final String _BSTATE = "BState";
	public static final String _BRESERVE = "BReserve";

	public void save(Books transientInstance) {
		log.debug("saving Books instance");
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

	public void delete(Books persistentInstance) {
		log.debug("deleting Books instance");
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

	public Books findById(java.lang.Long id) {
		log.debug("getting Books instance with id: " + id);
		try {
			Books instance = (Books) getSession().get(
					"com.TMMS.Main.bean.Books", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Books instance) {
		log.debug("finding Books instance by example");
		try {
			List results = getSession()
					.createCriteria("com.TMMS.Main.bean.Books")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List findByKeyword(String keyword){
		try {
			Long uidLong;
			try {
				uidLong = Long.parseLong(keyword);
			} catch (Exception e) {
				String queryString = "from Books as model where"
						+ " model.BName  like ? or"
						+ " model.BAuthor  like ? or"
						+ " model.BIsbn  like ? or"
						+ " model.BPress like ? or"
						+ " model.BOrder like ? ";
				Query queryObject = getSession().createQuery(queryString);
				queryObject.setParameter(0, (Object)("%"+keyword+"%"));
				queryObject.setParameter(1, (Object)("%"+keyword+"%"));
				queryObject.setParameter(2, (Object)("%"+keyword+"%"));
				queryObject.setParameter(3, (Object)("%"+keyword+"%"));
				queryObject.setParameter(4, (Object)("%"+keyword+"%"));
				return queryObject.list();
			}
			String queryString = "from Users as model where"
					+ " model.BName  like ? or"
					+ " model.BAuthor like ? or"
					+ " model.BIsbn    like '%"+uidLong+"%' or"
					+ " model.BPress like ? ";
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
	
	public List findAllNewBooks(){
		log.debug("book manager finding all new books");
		try {
			String queryString = "from Books where BState=0";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Books instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Books as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBName(Object BName) {
		return findByProperty(_BNAME, BName);
	}

	public List findByBAuthor(Object BAuthor) {
		return findByProperty(_BAUTHOR, BAuthor);
	}

	public List findByBPrice(Object BPrice) {
		return findByProperty(_BPRICE, BPrice);
	}

	public List findByBIsbn(Object BIsbn) {
		return findByProperty(_BISBN, BIsbn);
	}

	public List findByBPress(Object BPress) {
		return findByProperty(_BPRESS, BPress);
	}

	public List findByBOrder(Object BOrder) {
		return findByProperty(_BORDER, BOrder);
	}

	public List findByBPlan(Object BPlan) {
		return findByProperty(_BPLAN, BPlan);
	}

	public List findByBBorders(Object BBorders) {
		return findByProperty(_BBORDERS, BBorders);
	}

	public List findByBGrand(Object BGrand) {
		return findByProperty(_BGRAND, BGrand);
	}

	public List findByBState(Object BState) {
		return findByProperty(_BSTATE, BState);
	}

	public List findByBReserve(Object BReserve) {
		return findByProperty(_BRESERVE, BReserve);
	}

	public List findAll() {
		log.debug("finding all Books instances");
		try {
			String queryString = "from Books";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Books merge(Books detachedInstance) {
		log.debug("merging Books instance");
		try {
			Books result = (Books) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Books instance) {
		log.debug("attaching dirty Books instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Books instance) {
		log.debug("attaching clean Books instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}