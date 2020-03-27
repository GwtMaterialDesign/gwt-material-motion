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

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.pattern.base.SharedElementPattern;

public class MaterialFadeThrough extends SharedElementPattern implements HasEnterTransition {

    protected EnterTransition enterTransition = new EnterTransition();

    public MaterialFadeThrough(MaterialWidget source, MaterialWidget target) {
        super(source, target);

        init();
    }

    @Override
    public void init() {
        enterTransition.register(new FadeOut(source)
            .duration(80)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        enterTransition.register(new FadeIn(target)
            .delay(80)
            .duration(220));

        enterTransition.register(new Scale(target)
            .delay(80)
            .duration(220)
            .from(0.92)
            .to(1));
    }

    @Override
    public void completed() {

    }

    @Override
    public void enter() {
        enterTransition.call();
    }
}
