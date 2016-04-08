package com.TMMS.Main.bean;

/**
 * AbstractBoId entity provides the base persistence definition of the BoId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBoId implements java.io.Serializable {

	// Fields

	private Books books;
	private Orders orders;

	// Constructors

	/** default constructor */
	public AbstractBoId() {
	}

	/** full constructor */
	public AbstractBoId(Books books, Orders orders) {
		this.books = books;
		this.orders = orders;
	}

	// Property accessors

	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractBoId))
			return false;
		AbstractBoId castOther = (AbstractBoId) other;

		return ((this.getBooks() == castOther.getBooks()) || (this.getBooks() != null
				&& castOther.getBooks() != null && this.getBooks().equals(
				castOther.getBooks())))
				&& ((this.getOrders() == castOther.getOrders()) || (this
						.getOrders() != null && castOther.getOrders() != null && this
						.getOrders().equals(castOther.getOrders())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getBooks() == null ? 0 : this.getBooks().hashCode());
		result = 37 * result
				+ (getOrders() == null ? 0 : this.getOrders().hashCode());
		return result;
	}

}