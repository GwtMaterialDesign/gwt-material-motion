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
package gwt.material.design.motion.client.animation;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.animate.Animation;

//TODO: Added TransformAnimation
public class Scale implements Animation {

    protected int duration, delay;
    protected Widget widget;
    protected double from;
    protected double to;

    public Scale(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void animate() {
        widget.getElement().getStyle().setProperty("transform", "scale(" + from + ")");
        Scheduler.get().scheduleFixedDelay(() -> {
            widget.getElement().getStyle().setProperty("transition", duration + "ms");
            widget.getElement().getStyle().setProperty("transform", "scale(" + to + ")");
            return false;
        }, delay);
    }

    @Override
    public Widget getWidget() {
        return widget;
    }

    @Override
    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public int getDelay() {
        return delay;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }
}
