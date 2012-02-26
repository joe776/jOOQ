/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 392674640;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.sybase.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}
