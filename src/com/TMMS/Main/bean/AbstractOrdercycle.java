package com.TMMS.Main.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrdercycle entity provides the base persistence definition of the
 * Ordercycle entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrdercycle implements java.io.Serializable {

	// Fields

	private Long ocId;
	private Date ocSt;
	private Date ocEt;
	private String ocCh;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrdercycle() {
	}

	/** minimal constructor */
	public AbstractOrdercycle(Long ocId, Date ocSt, Date ocEt) {
		this.ocId = ocId;
		this.ocSt = ocSt;
		this.ocEt = ocEt;
	}

	/** full constructor */
	public AbstractOrdercycle(Long ocId, Date ocSt, Date ocEt, String ocCh,
			Set orderses) {
		this.ocId = ocId;
		this.ocSt = ocSt;
		this.ocEt = ocEt;
		this.ocCh = ocCh;
		this.orderses = orderses;
	}

	// Property accessors

	public Long getOcId() {
		return this.ocId;
	}

	public void setOcId(Long ocId) {
		this.ocId = ocId;
	}

	public Date getOcSt() {
		return this.ocSt;
	}

	public void setOcSt(Date ocSt) {
		this.ocSt = ocSt;
	}

	public Date getOcEt() {
		return this.ocEt;
	}

	public void setOcEt(Date ocEt) {
		this.ocEt = ocEt;
	}

	public String getOcCh() {
		return this.ocCh;
	}

	public void setOcCh(String ocCh) {
		this.ocCh = ocCh;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}