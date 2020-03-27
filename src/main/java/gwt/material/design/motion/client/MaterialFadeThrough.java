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
package gwt.material.design.motion.client;

import com.google.gwt.dom.client.Style;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.MotionConfig;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.animate.Transition;

public class MaterialFadeThrough extends AbstractMotionPattern {

    public MaterialFadeThrough(MotionConfig motionData) {
        super(motionData);
    }

    @Override
    public void init(MotionConfig config) {
        super.init(config);

        config.getTarget().setVisibility(Style.Visibility.HIDDEN);
    }

    @Override
    public void execute() {
        super.execute();

        MaterialWidget source = config.getSource();
        MaterialWidget target = config.getTarget();

        FadeOut sourceFadeOut = new FadeOut(source);
        sourceFadeOut.setTransition(Transition.FADEOUT);
        sourceFadeOut.setDuration(80);
        sourceFadeOut.animate(() -> {
            target.setVisibility(Style.Visibility.VISIBLE);
            source.setVisibility(Style.Visibility.HIDDEN);
        });


        FadeIn targetFadeIn = new FadeIn(target);
        targetFadeIn.setDelay(80);
        targetFadeIn.setDuration(220);
        targetFadeIn.animate();

        Scale targetScale = new Scale(target);
        targetScale.setDelay(80);
        targetScale.setDuration(220);
        targetScale.setTo(1);
        targetScale.setFrom(0.92);
        targetScale.animate();
    }
}
