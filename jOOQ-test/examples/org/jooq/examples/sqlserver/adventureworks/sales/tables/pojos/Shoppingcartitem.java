/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ShoppingCartItem", schema = "Sales")
public class Shoppingcartitem implements java.io.Serializable {

	private static final long serialVersionUID = -1426971768;

	private java.lang.Integer  shoppingcartitemid;
	private java.lang.String   shoppingcartid;
	private java.lang.Integer  quantity;
	private java.lang.Integer  productid;
	private java.sql.Timestamp datecreated;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ShoppingCartItemID", unique = true)
	public java.lang.Integer getShoppingcartitemid() {
		return this.shoppingcartitemid;
	}

	public void setShoppingcartitemid(java.lang.Integer shoppingcartitemid) {
		this.shoppingcartitemid = shoppingcartitemid;
	}

	@javax.persistence.Column(name = "ShoppingCartID")
	public java.lang.String getShoppingcartid() {
		return this.shoppingcartid;
	}

	public void setShoppingcartid(java.lang.String shoppingcartid) {
		this.shoppingcartid = shoppingcartid;
	}

	@javax.persistence.Column(name = "Quantity")
	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	@javax.persistence.Column(name = "ProductID")
	public java.lang.Integer getProductid() {
		return this.productid;
	}

	public void setProductid(java.lang.Integer productid) {
		this.productid = productid;
	}

	@javax.persistence.Column(name = "DateCreated")
	public java.sql.Timestamp getDatecreated() {
		return this.datecreated;
	}

	public void setDatecreated(java.sql.Timestamp datecreated) {
		this.datecreated = datecreated;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
