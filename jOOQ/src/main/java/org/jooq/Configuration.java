/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.jooq.conf.Settings;
import org.jooq.impl.Executor;

/**
 * The Configuration holds data about sql dialects, connections / data sources,
 * and custom settings as well as custom data.
 * <p>
 * Essentially, the lifecycle of all objects in {@link Configuration} is the
 * same. It corresponds to the lifecycle of a single {@link Query} and its
 * rendering, variable binding, execution, and data fetching phases. This is
 * also reflected in the fact that {@link ExecuteListener} objects are
 * re-created every time a <code>Query</code> is executed
 * <p>
 * However, {@link Configuration} / {@link Executor} may be reused for several
 * consecutive queries in a single thread, if the supplied
 * <code>Connection</code> / <code>DataSource</code> allows this and if client
 * code can live with the possibility of stale state in
 * {@link Configuration#getData()} between executions
 *
 * @author Lukas Eder
 */
public interface Configuration extends Serializable {

    /**
     * Retrieve the configured dialect
     */
    SQLDialect getDialect();

    /**
     * Get this configuration's underlying connection provider
     */
    ConnectionProvider getConnectionProvider();

    /**
     * Retrieve the configured schema mapping
     *
     * @deprecated - 2.0.5 - Use {@link #getSettings()} instead
     */
    @Deprecated
    SchemaMapping getSchemaMapping();

    /**
     * Retrieve the runtime configuration settings
     */
    Settings getSettings();

    /**
     * Get all custom data from this <code>Configuration</code>
     * <p>
     * This is custom data that was previously set to the configuration using
     * {@link #setData(String, Object)}. Use custom data if you want to pass
     * data to your custom {@link QueryPart} or {@link ExecuteListener} objects
     * to be made available at render, bind, execution, fetch time.
     * <p>
     * See {@link ExecuteListener} for more details.
     *
     * @return The custom data. This is never <code>null</code>
     * @see ExecuteListener
     */
    Map<String, Object> getData();

    /**
     * Get some custom data from this <code>Configuration</code>
     * <p>
     * This is custom data that was previously set to the configuration using
     * {@link #setData(String, Object)}. Use custom data if you want to pass
     * data to your custom {@link QueryPart} or {@link ExecuteListener} objects
     * to be made available at render, bind, execution, fetch time.
     * <p>
     * See {@link ExecuteListener} for more details.
     *
     * @param key A key to identify the custom data
     * @return The custom data or <code>null</code> if no such data is contained
     *         in this <code>Configuration</code>
     * @see ExecuteListener
     */
    Object getData(String key);

    /**
     * Set some custom data to this <code>Configuration</code>
     * <p>
     * Use custom data if you want to pass data to your custom {@link QueryPart}
     * or {@link ExecuteListener} objects to be made available at render, bind,
     * execution, fetch time.
     * <p>
     * Be sure that your custom data implements {@link Serializable} if you want
     * to serialise this <code>Configuration</code> or objects referencing this
     * <code>Configuration</code>, e.g. your {@link Record} types.
     * <p>
     * See {@link ExecuteListener} for more details.
     *
     * @param key A key to identify the custom data
     * @param value The custom data or <code>null</code> to unset the custom
     *            data
     * @return The previously set custom data or <code>null</code> if no data
     *         was previously set for the given key
     * @see ExecuteListener
     */
    Object setData(String key, Object value);

    List<ExecuteListener> getExecuteListeners();

    void setExecuteListeners(List<ExecuteListener> listeners);

}
