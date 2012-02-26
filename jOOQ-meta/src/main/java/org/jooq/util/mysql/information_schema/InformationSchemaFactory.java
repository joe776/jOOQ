/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class InformationSchemaFactory extends org.jooq.util.mysql.MySQLFactory {

	private static final long serialVersionUID = 1683729425;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
