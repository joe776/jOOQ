/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritory", schema = "Sales")
public class SalesterritoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryRecord> {

	private static final long serialVersionUID = -1308758909;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setTerritoryid(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.TERRITORYID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "TerritoryID", unique = true)
	public java.lang.Integer getTerritoryid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.TERRITORYID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCountryregioncode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COUNTRYREGIONCODE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CountryRegionCode")
	public java.lang.String getCountryregioncode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COUNTRYREGIONCODE);
	}

	/**
	 * An uncommented item
	 */
	public void setGroup(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.GROUP, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Group")
	public java.lang.String getGroup() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.GROUP);
	}

	/**
	 * An uncommented item
	 */
	public void setSalesytd(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.SALESYTD, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SalesYTD")
	public java.math.BigDecimal getSalesytd() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.SALESYTD);
	}

	/**
	 * An uncommented item
	 */
	public void setSaleslastyear(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.SALESLASTYEAR, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SalesLastYear")
	public java.math.BigDecimal getSaleslastyear() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.SALESLASTYEAR);
	}

	/**
	 * An uncommented item
	 */
	public void setCostytd(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COSTYTD, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CostYTD")
	public java.math.BigDecimal getCostytd() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COSTYTD);
	}

	/**
	 * An uncommented item
	 */
	public void setCostlastyear(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COSTLASTYEAR, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CostLastYear")
	public java.math.BigDecimal getCostlastyear() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.COSTLASTYEAR);
	}

	/**
	 * An uncommented item
	 */
	public void setRowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.ROWGUID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.ROWGUID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifieddate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.MODIFIEDDATE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY.MODIFIEDDATE);
	}

	/**
	 * Create a detached SalesterritoryRecord
	 */
	public SalesterritoryRecord() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritory.SALESTERRITORY);
	}
}
