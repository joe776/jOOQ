/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK")
public class V_BOOK extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_BOOK> implements java.lang.Cloneable, org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE {

	private static final long serialVersionUID = 1926551271;

	/**
	 * Setter for <code>V_BOOK.ID</code>. 
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>V_BOOK.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>V_BOOK.AUTHOR_ID</code>. 
	 */
	@Override
	public void setAUTHOR_ID(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>V_BOOK.AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getAUTHOR_ID() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@Override
	public void setCO_AUTHOR_ID(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>V_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	@Override
	public java.lang.Integer getCO_AUTHOR_ID() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>V_BOOK.DETAILS_ID</code>. 
	 */
	@Override
	public void setDETAILS_ID(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>V_BOOK.DETAILS_ID</code>. 
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	@Override
	public java.lang.Integer getDETAILS_ID() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>V_BOOK.TITLE</code>. 
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>V_BOOK.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>V_BOOK.PUBLISHED_IN</code>. 
	 */
	@Override
	public void setPUBLISHED_IN(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>V_BOOK.PUBLISHED_IN</code>. 
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getPUBLISHED_IN() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>V_BOOK.LANGUAGE_ID</code>. 
	 */
	@Override
	public void setLANGUAGE_ID(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>V_BOOK.LANGUAGE_ID</code>. 
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getLANGUAGE_ID() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>V_BOOK.CONTENT_TEXT</code>. 
	 */
	@Override
	public void setCONTENT_TEXT(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>V_BOOK.CONTENT_TEXT</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	@Override
	public java.lang.String getCONTENT_TEXT() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>V_BOOK.CONTENT_PDF</code>. 
	 */
	@Override
	public void setCONTENT_PDF(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>V_BOOK.CONTENT_PDF</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	@Override
	public byte[] getCONTENT_PDF() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAUTHOR_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCO_AUTHOR_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDETAILS_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTITLE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPUBLISHED_IN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLANGUAGE_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCONTENT_TEXT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getCONTENT_PDF();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE from) {
		setID(from.getID());
		setAUTHOR_ID(from.getAUTHOR_ID());
		setCO_AUTHOR_ID(from.getCO_AUTHOR_ID());
		setDETAILS_ID(from.getDETAILS_ID());
		setTITLE(from.getTITLE());
		setPUBLISHED_IN(from.getPUBLISHED_IN());
		setLANGUAGE_ID(from.getLANGUAGE_ID());
		setCONTENT_TEXT(from.getCONTENT_TEXT());
		setCONTENT_PDF(from.getCONTENT_PDF());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V_BOOK
	 */
	public V_BOOK() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK);
	}
}
