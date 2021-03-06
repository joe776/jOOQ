/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class GET_BOOKS extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1646297678;

	/**
	 * The parameter <code>U_AUTHOR_TYPE.GET_BOOKS.SELF</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> SELF = createParameter("SELF", org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE.getDataType());

	/**
	 * The parameter <code>U_AUTHOR_TYPE.GET_BOOKS.BOOK1</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> BOOK1 = createParameter("BOOK1", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType());

	/**
	 * The parameter <code>U_AUTHOR_TYPE.GET_BOOKS.BOOK2</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> BOOK2 = createParameter("BOOK2", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType());

	/**
	 * The parameter <code>U_AUTHOR_TYPE.GET_BOOKS.BOOKS</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE> BOOKS = createParameter("BOOKS", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public GET_BOOKS() {
		super("GET_BOOKS", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);

		addInOutParameter(SELF);
		addOutParameter(BOOK1);
		addOutParameter(BOOK2);
		addOutParameter(BOOKS);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSELF(org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS.SELF, value);
	}

	/**
	 * Get the <code>SELF</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE getSELF() {
		return getValue(SELF);
	}

	/**
	 * Get the <code>BOOK1</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE getBOOK1() {
		return getValue(BOOK1);
	}

	/**
	 * Get the <code>BOOK2</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE getBOOK2() {
		return getValue(BOOK2);
	}

	/**
	 * Get the <code>BOOKS</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TABLE getBOOKS() {
		return getValue(BOOKS);
	}
}
