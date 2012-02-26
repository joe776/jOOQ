/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 510968114;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ID")
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "FIRST_NAME")
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LAST_NAME")
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH")
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH")
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ADDRESS")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR);
	}
}
