/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = 1987774029;

	/**
	 * The singleton instance of t_658_ref
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.sqlite.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord> __RECORD_TYPE = org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.lang.String> REF_11 = createField("ref_11", org.jooq.impl.SQLDataType.CHAR, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer> REF_21 = createField("ref_21", org.jooq.impl.SQLDataType.INTEGER, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.math.BigInteger> REF_31 = createField("ref_31", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.lang.String> REF_12 = createField("ref_12", org.jooq.impl.SQLDataType.CHAR, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.lang.Integer> REF_22 = createField("ref_22", org.jooq.impl.SQLDataType.INTEGER, T_658_REF);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_658RefRecord, java.math.BigInteger> REF_32 = createField("ref_32", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("t_658_ref");
	}
}
