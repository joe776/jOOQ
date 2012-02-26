/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Constraints extends org.jooq.impl.TableImpl<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord> {

	private static final long serialVersionUID = 1972451304;

	/**
	 * The singleton instance of CONSTRAINTS
	 */
	public static final org.jooq.util.h2.information_schema.tables.Constraints CONSTRAINTS = new org.jooq.util.h2.information_schema.tables.Constraints();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord> __RECORD_TYPE = org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> UNIQUE_INDEX_NAME = createField("UNIQUE_INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> CHECK_EXPRESSION = createField("CHECK_EXPRESSION", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> COLUMN_LIST = createField("COLUMN_LIST", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR, CONSTRAINTS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.ConstraintsRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, CONSTRAINTS);

	/**
	 * No further instances allowed
	 */
	private Constraints() {
		super("CONSTRAINTS", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
