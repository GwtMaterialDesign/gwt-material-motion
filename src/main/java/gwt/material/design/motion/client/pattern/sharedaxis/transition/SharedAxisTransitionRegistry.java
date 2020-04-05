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
package gwt.material.design.motion.client.pattern.sharedaxis.transition;

import gwt.material.design.motion.client.pattern.sharedaxis.SharedAxisType;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedXAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedXAxisExitTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedYAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedYAxisExitTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedZAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedZAxisExitTransition;

import java.util.HashMap;
import java.util.Map;

public class SharedAxisTransitionRegistry {

    protected static Map<SharedAxisType, SharedAxisTransitionSet> enterTransitionMap = new HashMap<>();
    protected static Map<SharedAxisType, SharedAxisTransitionSet> exitTransitionMap = new HashMap<>();

    static {
        enterTransitionMap.put(SharedAxisType.X_AXIS, new SharedXAxisEnterTransition());
        enterTransitionMap.put(SharedAxisType.Y_AXIS, new SharedYAxisEnterTransition());
        enterTransitionMap.put(SharedAxisType.Z_AXIS, new SharedZAxisEnterTransition());

        exitTransitionMap.put(SharedAxisType.X_AXIS, new SharedXAxisExitTransition());
        exitTransitionMap.put(SharedAxisType.Y_AXIS, new SharedYAxisExitTransition());
        exitTransitionMap.put(SharedAxisType.Z_AXIS, new SharedZAxisExitTransition());
    }

    public SharedAxisTransitionSet getEnterTransition(SharedAxisType axisType, boolean forward) {
        SharedAxisTransitionSet sharedAxisTransitionSet = enterTransitionMap.get(axisType);
        sharedAxisTransitionSet.setForward(forward);
        return sharedAxisTransitionSet;
    }

    public SharedAxisTransitionSet getExitTransition(SharedAxisType axisType, boolean forward) {
        SharedAxisTransitionSet sharedAxisTransitionSet = exitTransitionMap.get(axisType);
        sharedAxisTransitionSet.setForward(forward);
        return sharedAxisTransitionSet;
    }
}
