/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class InventoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> {

	private static final long serialVersionUID = 2040732694;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setInventoryId(java.lang.Integer value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.INVENTORY_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getInventoryId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.INVENTORY_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fetchRentalList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL.INVENTORY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.INVENTORY_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.FILM_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.FilmRecord fetchFilm() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.FILM_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public void setStoreId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.STORE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public java.lang.Byte getStoreId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.STORE_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_inventory_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord fetchStore() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.STORE_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.LAST_UPDATE);
	}

	/**
	 * Create a detached InventoryRecord
	 */
	public InventoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY);
	}
}
