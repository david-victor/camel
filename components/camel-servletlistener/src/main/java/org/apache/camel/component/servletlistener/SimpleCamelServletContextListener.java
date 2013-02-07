/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.servletlistener;

import java.util.Map;

import org.apache.camel.impl.SimpleRegistry;
import org.apache.camel.spi.Registry;

/**
 * An implementation of {@link CamelServletContextListener} that uses the {@link SimpleRegistry}
 * as its {@link Registry}.
 */
public class SimpleCamelServletContextListener extends CamelServletContextListener {

    private Map map;

    @Override
    public Registry createRegistry() throws Exception {
        map = new SimpleRegistry();
        return (Registry) map;
    }

    /**
     * Gets the {@link Map} that contains the data for the {@link SimpleRegistry}
     */
    public Map getMap() {
        return map;
    }
}
