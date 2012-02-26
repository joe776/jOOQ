/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class T_BOOK_STORE extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> {

	private static final long serialVersionUID = -1321418142;

	/**
	 * The singleton instance of TEST.T_BOOK_STORE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE T_BOOK_STORE = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> __RECORD_TYPE = org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The books store name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private T_BOOK_STORE() {
		super("T_BOOK_STORE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_BOOK_STORE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE>>asList(org.jooq.test.oracle3.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE(alias);
	}
}
