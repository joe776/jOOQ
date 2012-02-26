/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vemployeedepartment extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord> {

	private static final long serialVersionUID = -1951381060;

	/**
	 * The singleton instance of HumanResources.vEmployeeDepartment
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment VEMPLOYEEDEPARTMENT = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.Integer> EMPLOYEEID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> TITLE = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> MIDDLENAME = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> LASTNAME = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> SUFFIX = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> JOBTITLE = createField("JobTitle", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> DEPARTMENT = createField("Department", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.lang.String> GROUPNAME = createField("GroupName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VemployeedepartmentRecord, java.sql.Timestamp> STARTDATE = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vemployeedepartment() {
		super("vEmployeeDepartment", org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES);
	}

	/**
	 * No further instances allowed
	 */
	private Vemployeedepartment(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment.VEMPLOYEEDEPARTMENT);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vemployeedepartment(alias);
	}
}
