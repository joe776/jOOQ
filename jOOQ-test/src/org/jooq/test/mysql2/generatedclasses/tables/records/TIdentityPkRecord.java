/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_identity_pk", schema = "test2")
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 539589935;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "val")
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL);
	}

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}
