/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.motion.client.config;

import gwt.material.design.client.base.MaterialWidget;

public class MotionConfig {

    protected MaterialWidget source;
    protected MaterialWidget target;

    public MotionConfig() {
    }

    public MotionConfig(MaterialWidget source, MaterialWidget target) {
        this.source = source;
        this.target = target;
    }

    public MaterialWidget getSource() {
        return source;
    }

    public void setSource(MaterialWidget source) {
        this.source = source;
    }

    public MaterialWidget getTarget() {
        return target;
    }

    public void setTarget(MaterialWidget target) {
        this.target = target;
    }
}
