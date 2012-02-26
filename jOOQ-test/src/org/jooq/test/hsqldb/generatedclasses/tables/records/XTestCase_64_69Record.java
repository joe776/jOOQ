/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 61605488;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValueAsShort(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES PUBLIC.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES PUBLIC.X_UNUSED (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES PUBLIC.X_UNUSED (ID)
	 * </pre></code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
