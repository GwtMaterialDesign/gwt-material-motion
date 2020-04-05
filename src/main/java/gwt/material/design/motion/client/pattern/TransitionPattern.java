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
package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;

public interface TransitionPattern {

    void animate(Widget source, Widget target);

    void enter(Widget widget, Functions.Func startCallback, Functions.Func completeCallback);

    default void enter(Widget widget) {
        enter(widget, null, null);
    }

    default void enter(Widget widget, Functions.Func completeCallback) {
        enter(widget, null, completeCallback);
    }

    void exit(Widget widget, Functions.Func startCallback, Functions.Func completeCallback);

    default void exit(Widget widget) {
        exit(widget, null, null);
    }

    default void exit(Widget widget, Functions.Func completeCallback) {
        exit(widget, null, completeCallback);
    }

    TransitionSet getEnterTransition();

    TransitionSet getExitTransition();
}
