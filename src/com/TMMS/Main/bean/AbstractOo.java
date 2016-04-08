package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractOo entity provides the base persistence definition of the Oo entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractOo implements java.io.Serializable {

	// Fields

	private OoId id;
	private Long ooId;
	private Date ooTime;
	private Boolean ooType;
	private String ooReason;

	// Constructors

	/** default constructor */
	public AbstractOo() {
	}

	/** minimal constructor */
	public AbstractOo(OoId id, Long ooId, Boolean ooType) {
		this.id = id;
		this.ooId = ooId;
		this.ooType = ooType;
	}

	/** full constructor */
	public AbstractOo(OoId id, Long ooId, Date ooTime, Boolean ooType,
			String ooReason) {
		this.id = id;
		this.ooId = ooId;
		this.ooTime = ooTime;
		this.ooType = ooType;
		this.ooReason = ooReason;
	}

	// Property accessors

	public OoId getId() {
		return this.id;
	}

	public void setId(OoId id) {
		this.id = id;
	}

	public Long getOoId() {
		return this.ooId;
	}

	public void setOoId(Long ooId) {
		this.ooId = ooId;
	}

	public Date getOoTime() {
		return this.ooTime;
	}

	public void setOoTime(Date ooTime) {
		this.ooTime = ooTime;
	}

	public Boolean getOoType() {
		return this.ooType;
	}

	public void setOoType(Boolean ooType) {
		this.ooType = ooType;
	}

	public String getOoReason() {
		return this.ooReason;
	}

	public void setOoReason(String ooReason) {
		this.ooReason = ooReason;
	}

}