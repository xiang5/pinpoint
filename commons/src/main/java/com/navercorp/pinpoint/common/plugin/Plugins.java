/**
 * Copyright 2014 NAVER Corp.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.navercorp.pinpoint.common.plugin;

import java.net.URL;
import java.util.List;

/**
 * @author Jongho Moon
 *
 */
public class Plugins<T> {
    private final List<T> plugins;
    private final URL[] pluginJars;
    
    public Plugins(List<T> plugins, URL[] pluginJars) {
        this.plugins = plugins;
        this.pluginJars = pluginJars;
    }

    public List<T> getPlugins() {
        return plugins;
    }

    public URL[] getPluginJars() {
        return pluginJars;
    }
}
