/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDirectory extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> {

	private static final long serialVersionUID = 1892502399;

	/**
	 * The singleton instance of <code>TEST.T_DIRECTORY</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TDirectory T_DIRECTORY = new org.jooq.test.oracle.generatedclasses.test.tables.TDirectory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord.class;
	}

	/**
	 * The column <code>TEST.T_DIRECTORY.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_DIRECTORY.PARENT_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, java.lang.Integer> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, java.lang.Integer> IS_DIRECTORY = createField("IS_DIRECTORY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_DIRECTORY.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * Create a <code>TEST.T_DIRECTORY</code> table reference
	 */
	public TDirectory() {
		super("T_DIRECTORY", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_DIRECTORY</code> table reference
	 */
	public TDirectory(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DIRECTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DIRECTORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DIRECTORY_SELF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TDirectory as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TDirectory(alias);
	}
}
