/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class FilmTextRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmTextRecord> {

	private static final long serialVersionUID = 2128418409;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.FILM_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.DESCRIPTION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT.DESCRIPTION);
	}

	/**
	 * Create a detached FilmTextRecord
	 */
	public FilmTextRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmText.FILM_TEXT);
	}
}
