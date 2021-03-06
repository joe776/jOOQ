/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS")
public class T_ARRAYS_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_ARRAYS_INTERFACE {

	private static final long serialVersionUID = 833137705;

	private java.lang.Integer                                                      ID;
	private org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY      STRING_ARRAY;
	private org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY      NUMBER_ARRAY;
	private org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY NUMBER_LONG_ARRAY;
	private org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY        DATE_ARRAY;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "STRING_ARRAY", length = 101)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY getSTRING_ARRAY() {
		return this.STRING_ARRAY;
	}

	@Override
	public void setSTRING_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY STRING_ARRAY) {
		this.STRING_ARRAY = STRING_ARRAY;
	}

	@javax.persistence.Column(name = "NUMBER_ARRAY", length = 109)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY getNUMBER_ARRAY() {
		return this.NUMBER_ARRAY;
	}

	@Override
	public void setNUMBER_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY NUMBER_ARRAY) {
		this.NUMBER_ARRAY = NUMBER_ARRAY;
	}

	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY", length = 109)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY getNUMBER_LONG_ARRAY() {
		return this.NUMBER_LONG_ARRAY;
	}

	@Override
	public void setNUMBER_LONG_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY NUMBER_LONG_ARRAY) {
		this.NUMBER_LONG_ARRAY = NUMBER_LONG_ARRAY;
	}

	@javax.persistence.Column(name = "DATE_ARRAY", length = 49)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY getDATE_ARRAY() {
		return this.DATE_ARRAY;
	}

	@Override
	public void setDATE_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY DATE_ARRAY) {
		this.DATE_ARRAY = DATE_ARRAY;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_ARRAYS_INTERFACE from) {
		setID(from.getID());
		setSTRING_ARRAY(from.getSTRING_ARRAY());
		setNUMBER_ARRAY(from.getNUMBER_ARRAY());
		setNUMBER_LONG_ARRAY(from.getNUMBER_LONG_ARRAY());
		setDATE_ARRAY(from.getDATE_ARRAY());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_ARRAYS_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
