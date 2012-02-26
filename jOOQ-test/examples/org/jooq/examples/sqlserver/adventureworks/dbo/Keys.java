/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the dbo schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AwbuildversionRecord, java.lang.Byte> IDENTITY_AWBUILDVERSION = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Awbuildversion.AWBUILDVERSION, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Awbuildversion.AWBUILDVERSION.SYSTEMINFORMATIONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord, java.lang.Integer> IDENTITY_DATABASELOG = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG.DATABASELOGID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> IDENTITY_ERRORLOG = createIdentity(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLOGID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.AwbuildversionRecord> PK_AWBUILDVERSION_SYSTEMINFORMATIONID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Awbuildversion.AWBUILDVERSION, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Awbuildversion.AWBUILDVERSION.SYSTEMINFORMATIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaselogRecord> PK_DATABASELOG_DATABASELOGID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Databaselog.DATABASELOG.DATABASELOGID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> PK_ERRORLOG_ERRORLOGID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG.ERRORLOGID);

	// FOREIGN KEY definitions

	/**
	 * No instances
	 */
	private Keys() {}
}
