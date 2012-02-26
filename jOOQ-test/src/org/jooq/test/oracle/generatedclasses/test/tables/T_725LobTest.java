/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 669681458;

	/**
	 * The singleton instance of TEST.T_725_LOB_TEST
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("T_725_LOB_TEST", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_725_LOB_TEST);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest(alias);
	}
}
