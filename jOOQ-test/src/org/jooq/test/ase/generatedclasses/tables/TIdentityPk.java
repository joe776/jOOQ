/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPk extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 1910088639;

	/**
	 * The singleton instance of t_identity_pk
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.ase.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * No further instances allowed
	 */
	private TIdentityPk() {
		super("t_identity_pk", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.ase.generatedclasses.Keys.IDENTITY_t_identity_pk;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.t_identity_pk__pk_t_identity_pk;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.t_identity_pk__pk_t_identity_pk);
	}
}