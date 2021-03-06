/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class CountryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> implements org.jooq.Record3<java.lang.Short, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -2048941490;

	/**
	 * Setter for <code>sakila.country.country_id</code>. 
	 */
	public void setCountryId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.country.country_id</code>. 
	 */
	public java.lang.Short getCountryId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.country.country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.country.country</code>. 
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.country.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.country.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getCountryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CountryRecord
	 */
	public CountryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY);
	}
}
