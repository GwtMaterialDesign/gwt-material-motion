package gwt.material.design.motion.client.events;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
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


import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.motion.client.config.MotionConfig;

public class MotionInitEvent extends GwtEvent<MotionInitEvent.MotionInitHandler> {

    private final MotionConfig motionData;

    public MotionInitEvent(MotionConfig motionData) {
        this.motionData = motionData;
    }

    public static void fire(HasHandlers source, MotionConfig motionData) {
        source.fireEvent(new MotionInitEvent(motionData));
    }

    @Override
    public Type<MotionInitHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(MotionInitHandler handler) {
        handler.onMotionInit(this);
    }

    public MotionConfig getMotionData() {
        return motionData;
    }

    public static final Type<MotionInitHandler> TYPE = new Type<>();

    public interface MotionInitHandler extends EventHandler {
        void onMotionInit(MotionInitEvent event);
    }
}