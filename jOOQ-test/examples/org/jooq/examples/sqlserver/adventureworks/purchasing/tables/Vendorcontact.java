/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vendorcontact extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord> {

	private static final long serialVersionUID = 1923316835;

	/**
	 * The singleton instance of Purchasing.VendorContact
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact VENDORCONTACT = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_VendorContact_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, java.lang.Integer> VENDORID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_VendorContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, java.lang.Integer> CONTACTID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_VendorContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, java.lang.Integer> CONTACTTYPEID = createField("ContactTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vendorcontact() {
		super("VendorContact", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING);
	}

	/**
	 * No further instances allowed
	 */
	private Vendorcontact(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact.VENDORCONTACT);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VENDORCONTACT_VENDORID_CONTACTID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VENDORCONTACT_VENDORID_CONTACTID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorcontactRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VENDORCONTACT_VENDOR_VENDORID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VENDORCONTACT_CONTACT_CONTACTID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VENDORCONTACT_CONTACTTYPE_CONTACTTYPEID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendorcontact(alias);
	}
}
