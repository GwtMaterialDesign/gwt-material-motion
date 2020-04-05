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
package gwt.material.design.motion.client.pattern.sharedaxis.transition.y;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedYAxisEnterTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        // Incoming or Target elements fade in
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(90)
            .duration(210)
            .animate();

        // Incoming or Target elements slide 20px (30dp) vertically
        new Slide(widget, Axis.VERTICAL)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .delay(90)
            .from(isForward() ? "20px" : "-20px")
            .to("0px")
            .duration(210)
            .animate();
    }
}
