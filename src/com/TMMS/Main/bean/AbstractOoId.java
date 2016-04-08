package com.TMMS.Main.bean;

/**
 * AbstractOoId entity provides the base persistence definition of the OoId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOoId implements java.io.Serializable {

	// Fields

	private Orders orders;
	private Users users;

	// Constructors

	/** default constructor */
	public AbstractOoId() {
	}

	/** full constructor */
	public AbstractOoId(Orders orders, Users users) {
		this.orders = orders;
		this.users = users;
	}

	// Property accessors

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractOoId))
			return false;
		AbstractOoId castOther = (AbstractOoId) other;

		return ((this.getOrders() == castOther.getOrders()) || (this
				.getOrders() != null && castOther.getOrders() != null && this
				.getOrders().equals(castOther.getOrders())))
				&& ((this.getUsers() == castOther.getUsers()) || (this
						.getUsers() != null && castOther.getUsers() != null && this
						.getUsers().equals(castOther.getUsers())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrders() == null ? 0 : this.getOrders().hashCode());
		result = 37 * result
				+ (getUsers() == null ? 0 : this.getUsers().hashCode());
		return result;
	}

}