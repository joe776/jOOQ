/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Columns extends org.jooq.impl.TableImpl<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord> {

	private static final long serialVersionUID = 1019942549;

	/**
	 * The singleton instance of COLUMNS
	 */
	public static final org.jooq.util.mysql.information_schema.tables.Columns COLUMNS = new org.jooq.util.mysql.information_schema.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord> __RECORD_TYPE = org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, org.jooq.tools.unsigned.ULong> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.CLOB, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, org.jooq.tools.unsigned.ULong> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, org.jooq.tools.unsigned.ULong> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, org.jooq.tools.unsigned.ULong> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, org.jooq.tools.unsigned.ULong> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.CLOB, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_KEY = createField("COLUMN_KEY", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> EXTRA = createField("EXTRA", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> PRIVILEGES = createField("PRIVILEGES", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.mysql.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_COMMENT = createField("COLUMN_COMMENT", org.jooq.impl.SQLDataType.VARCHAR, COLUMNS);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super("COLUMNS", org.jooq.util.mysql.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}
