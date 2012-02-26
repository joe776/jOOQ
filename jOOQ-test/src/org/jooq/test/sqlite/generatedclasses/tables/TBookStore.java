/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -776320077;

	/**
	 * The singleton instance of t_book_store
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.sqlite.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> __RECORD_TYPE = org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("t_book_store");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_STORE_NAME);
	}
}
