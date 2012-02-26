/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_986_2 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = -1944961365;

	/**
	 * The singleton instance of LUKAS.T_986_2
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.T_986_2 T_986_2 = new org.jooq.test.db2.generatedclasses.tables.T_986_2();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT T_986_2__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record, java.lang.Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, T_986_2);

	/**
	 * No further instances allowed
	 */
	private T_986_2() {
		super("T_986_2", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_986_2__PK_986;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record>>asList(org.jooq.test.db2.generatedclasses.Keys.T_986_2__PK_986);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.T_986_2__FK_986);
	}
}
