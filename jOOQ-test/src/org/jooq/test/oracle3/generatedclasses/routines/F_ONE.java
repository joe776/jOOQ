/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F_ONE extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1123894646;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public F_ONE() {
		super(org.jooq.SQLDialect.ORACLE, "F_ONE", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
