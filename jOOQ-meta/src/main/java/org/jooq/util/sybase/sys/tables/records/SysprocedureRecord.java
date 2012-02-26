/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class SysprocedureRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.sybase.sys.tables.records.SysprocedureRecord> {

	private static final long serialVersionUID = -569216412;

	/**
	 * An uncommented item
	 */
	public void setProcId(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getProcId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCreator(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.CREATOR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getCreator() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.CREATOR);
	}

	/**
	 * An uncommented item
	 */
	public void setObjectId(java.lang.Long value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.OBJECT_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getObjectId() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.OBJECT_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setProcName(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getProcName() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setProcDefn(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_DEFN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getProcDefn() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.PROC_DEFN);
	}

	/**
	 * An uncommented item
	 */
	public void setRemarks(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.REMARKS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getRemarks() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.REMARKS);
	}

	/**
	 * An uncommented item
	 */
	public void setReplicate(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.REPLICATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getReplicate() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.REPLICATE);
	}

	/**
	 * An uncommented item
	 */
	public void setSrvid(java.lang.Integer value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.SRVID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getSrvid() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.SRVID);
	}

	/**
	 * An uncommented item
	 */
	public void setSource(java.lang.String value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.SOURCE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSource() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.SOURCE);
	}

	/**
	 * An uncommented item
	 */
	public void setAvgNumRows(java.lang.Double value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.AVG_NUM_ROWS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Double getAvgNumRows() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.AVG_NUM_ROWS);
	}

	/**
	 * An uncommented item
	 */
	public void setAvgCost(java.lang.Double value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.AVG_COST, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Double getAvgCost() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.AVG_COST);
	}

	/**
	 * An uncommented item
	 */
	public void setStats(byte[] value) {
		setValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.STATS, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getStats() {
		return getValue(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE.STATS);
	}

	/**
	 * Create a detached SysprocedureRecord
	 */
	public SysprocedureRecord() {
		super(org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE);
	}
}
