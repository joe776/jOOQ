/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE")
public interface ITLanguage extends java.io.Serializable {

	/**
	 * Setter for <code>T_LANGUAGE.CD</code>. 
	 */
	public void setCd(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.CD</code>. 
	 */
	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 2)
	public java.lang.String getCd();

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION</code>. 
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION</code>. 
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public void setDescriptionEnglish(java.lang.String value);

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getDescriptionEnglish();

	/**
	 * Setter for <code>T_LANGUAGE.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>T_LANGUAGE.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITLanguage
	 */
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITLanguage from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITLanguage
	 */
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITLanguage> E into(E into);
}
