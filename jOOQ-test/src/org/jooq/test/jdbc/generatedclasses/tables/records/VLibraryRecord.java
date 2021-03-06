/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbc.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.jdbc.generatedclasses.tables.interfaces.IVLibrary {

	private static final long serialVersionUID = 713490454;

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>. 
	 */
	@Override
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>. 
	 */
	@Override
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.TITLE</code>. 
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.TITLE</code>. 
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.VLibrary.TITLE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.jdbc.generatedclasses.tables.VLibrary.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.jdbc.generatedclasses.tables.VLibrary.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.jdbc.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
