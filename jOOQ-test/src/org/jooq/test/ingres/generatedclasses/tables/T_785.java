/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -407591973;

	/**
	 * The singleton instance of test.t_785
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.T_785 T_785 = new org.jooq.test.ingres.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.T_785Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_785);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("t_785", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}
}
