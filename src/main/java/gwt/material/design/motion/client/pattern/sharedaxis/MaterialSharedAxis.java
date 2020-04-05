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
package gwt.material.design.motion.client.pattern.sharedaxis;

import gwt.material.design.motion.client.pattern.AbstractTransitionPattern;
import gwt.material.design.motion.client.pattern.TransitionSet;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionRegistry;

public class MaterialSharedAxis extends AbstractTransitionPattern {

    protected static MaterialSharedAxis instance;
    protected static SharedAxisTransitionRegistry registry = new SharedAxisTransitionRegistry();
    protected SharedAxisConfig config = new SharedAxisConfig(SharedAxisType.X_AXIS, true);

    public MaterialSharedAxis setConfig(SharedAxisConfig config) {
        this.config = config;
        return this;
    }

    @Override
    public TransitionSet getEnterTransition() {
        return registry.getEnterTransition(config.getAxisType(), config.isForward());
    }

    @Override
    public TransitionSet getExitTransition() {
        return registry.getExitTransition(config.getAxisType(), config.isForward());
    }

    public static MaterialSharedAxis getInstance() {
        if (instance == null) {
            instance = new MaterialSharedAxis();
        }
        return instance;
    }
}
