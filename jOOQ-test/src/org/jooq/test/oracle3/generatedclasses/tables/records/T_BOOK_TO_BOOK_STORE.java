/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public class T_BOOK_TO_BOOK_STORE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> implements java.lang.Cloneable, org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_TO_BOOK_STORE_INTERFACE {

	private static final long serialVersionUID = 463680623;

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	@Override
	public void setBOOK_STORE_NAME(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@Override
	public java.lang.String getBOOK_STORE_NAME() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	@Override
	public void setBOOK_ID(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getBOOK_ID() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	@Override
	public void setSTOCK(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	@javax.persistence.Column(name = "STOCK", precision = 7)
	@Override
	public java.lang.Integer getSTOCK() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBOOK_STORE_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBOOK_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getSTOCK();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_TO_BOOK_STORE_INTERFACE from) {
		setBOOK_STORE_NAME(from.getBOOK_STORE_NAME());
		setBOOK_ID(from.getBOOK_ID());
		setSTOCK(from.getSTOCK());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_TO_BOOK_STORE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_BOOK_TO_BOOK_STORE
	 */
	public T_BOOK_TO_BOOK_STORE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE);
	}
}
