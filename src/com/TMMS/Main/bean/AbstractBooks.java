package com.TMMS.Main.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractBooks entity provides the base persistence definition of the Books
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBooks implements java.io.Serializable {

	// Fields

	private Long BId;
	private String BName;
	private String BAuthor;
	private Long BPrice;
	private String BIsbn;
	private String BPress;
	private String BOrder;
	private String BPlan;
	private String BBorders;
	private String BGrand;
	private Boolean BState;
	private Long BReserve;
	private Set bos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractBooks() {
	}

	/** minimal constructor */
	public AbstractBooks(Long BId, String BName, String BAuthor, Long BPrice,
			String BIsbn, String BPress, String BOrder, Boolean BState,
			Long BReserve) {
		this.BId = BId;
		this.BName = BName;
		this.BAuthor = BAuthor;
		this.BPrice = BPrice;
		this.BIsbn = BIsbn;
		this.BPress = BPress;
		this.BOrder = BOrder;
		this.BState = BState;
		this.BReserve = BReserve;
	}

	/** full constructor */
	public AbstractBooks(Long BId, String BName, String BAuthor, Long BPrice,
			String BIsbn, String BPress, String BOrder, String BPlan,
			String BBorders, String BGrand, Boolean BState, Long BReserve,
			Set bos) {
		this.BId = BId;
		this.BName = BName;
		this.BAuthor = BAuthor;
		this.BPrice = BPrice;
		this.BIsbn = BIsbn;
		this.BPress = BPress;
		this.BOrder = BOrder;
		this.BPlan = BPlan;
		this.BBorders = BBorders;
		this.BGrand = BGrand;
		this.BState = BState;
		this.BReserve = BReserve;
		this.bos = bos;
	}

	// Property accessors

	public Long getBId() {
		return this.BId;
	}

	public void setBId(Long BId) {
		this.BId = BId;
	}

	public String getBName() {
		return this.BName;
	}

	public void setBName(String BName) {
		this.BName = BName;
	}

	public String getBAuthor() {
		return this.BAuthor;
	}

	public void setBAuthor(String BAuthor) {
		this.BAuthor = BAuthor;
	}

	public Long getBPrice() {
		return this.BPrice;
	}

	public void setBPrice(Long BPrice) {
		this.BPrice = BPrice;
	}

	public String getBIsbn() {
		return this.BIsbn;
	}

	public void setBIsbn(String BIsbn) {
		this.BIsbn = BIsbn;
	}

	public String getBPress() {
		return this.BPress;
	}

	public void setBPress(String BPress) {
		this.BPress = BPress;
	}

	public String getBOrder() {
		return this.BOrder;
	}

	public void setBOrder(String BOrder) {
		this.BOrder = BOrder;
	}

	public String getBPlan() {
		return this.BPlan;
	}

	public void setBPlan(String BPlan) {
		this.BPlan = BPlan;
	}

	public String getBBorders() {
		return this.BBorders;
	}

	public void setBBorders(String BBorders) {
		this.BBorders = BBorders;
	}

	public String getBGrand() {
		return this.BGrand;
	}

	public void setBGrand(String BGrand) {
		this.BGrand = BGrand;
	}

	public Boolean getBState() {
		return this.BState;
	}

	public void setBState(Boolean BState) {
		this.BState = BState;
	}

	public Long getBReserve() {
		return this.BReserve;
	}

	public void setBReserve(Long BReserve) {
		this.BReserve = BReserve;
	}

	public Set getBos() {
		return this.bos;
	}

	public void setBos(Set bos) {
		this.bos = bos;
	}

}