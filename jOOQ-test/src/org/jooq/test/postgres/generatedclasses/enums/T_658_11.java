/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_11 implements org.jooq.MasterDataType<java.lang.String> {

	/**
	 * A  
	 */
	A__("A  "),

	/**
	 * B  
	 */
	B__("B  "),

	/**
	 * C  
	 */
	C__("C  "),
	;

	private final java.lang.String id;

	private T_658_11(java.lang.String id) {
		this.id = id;
	}

	@Override
	public java.lang.String getPrimaryKey() {
		return id;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final java.lang.String getId() {
		return id;
	}
}
