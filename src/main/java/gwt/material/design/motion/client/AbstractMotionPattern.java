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

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.SimpleEventBus;
import gwt.material.design.motion.client.config.MotionConfig;
import gwt.material.design.motion.client.events.*;

public abstract class AbstractMotionPattern extends SimpleEventBus
    implements MotionPattern, HasMotionHandlers {

    protected MotionConfig config;

    protected AbstractMotionPattern() {
    }

    public AbstractMotionPattern(MotionConfig config) {
        this.config = config;

        init(config);
    }

    @Override
    public void init(MotionConfig config) {
        MotionInitEvent.fire(this, config);
    }

    @Override
    public void execute() {
        MotionStartedEvent.fire(this);
    }

    @Override
    public void completed() {
        MotionCompletedEvent.fire(this);
    }

    @Override
    public MotionConfig getConfig() {
        return config;
    }

    @Override
    public HandlerRegistration addMotionInitHandler(MotionInitEvent.MotionInitHandler handler) {
        return addHandler(MotionInitEvent.TYPE, handler);
    }

    @Override
    public HandlerRegistration addMotionStartedHandler(MotionStartedEvent.MotionStartedHandler handler) {
        return addHandler(MotionStartedEvent.TYPE, handler);
    }

    @Override
    public HandlerRegistration addMotionTransitioningHandler(MotionTransitioningEvent.MotionTransitioningHandler handler) {
        return addHandler(MotionTransitioningEvent.TYPE, handler);
    }

    @Override
    public HandlerRegistration addMotionCompletedHandler(MotionCompletedEvent.MotionCompletedHandler handler) {
        return addHandler(MotionCompletedEvent.TYPE, handler);
    }
}
