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
import gwt.material.design.jquery.client.api.Functions;

//TODO: Added TransformAnimation
public class Scale implements Animation {

    protected int duration, delay;
    protected Widget widget;
    protected Functions.Func startCallback, completeCallback;
    protected double from;
    protected double to;

    public Scale(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void animate() {
        Scheduler.get().scheduleFixedDelay(() -> {
            widget.getElement().getStyle().setProperty("transform", "scale(" + from + ")");
            Scheduler.get().scheduleFixedDelay(() -> {
                widget.getElement().getStyle().setProperty("transition", duration + "ms");
                widget.getElement().getStyle().setProperty("transform", "scale(" + to + ")");
                return false;
            }, delay);
            return false;
        }, delay);
    }

    public Scale duration(int duration) {
        setDuration(duration);
        return this;
    }

    public Scale delay(int delay) {
        setDelay(delay);
        return this;
    }

    public Scale completeCallback(Functions.Func completeCallback) {
        setCompleteCallback(completeCallback);
        return this;
    }

    public Scale startCallback(Functions.Func startCallback) {
        setStartCallback(startCallback);
        return this;
    }

    public Scale from(double from) {
        setFrom(from);
        return this;
    }

    public Scale to(double to) {
        setTo(to);
        return this;
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

    @Override
    public Functions.Func getCompleteCallback() {
        return completeCallback;
    }

    @Override
    public void setStartCallback(Functions.Func startCallback) {
        this.startCallback = startCallback;
    }

    @Override
    public Functions.Func getStartCallback() {
        return startCallback;
    }

    @Override
    public void setCompleteCallback(Functions.Func completeCallback) {
        this.completeCallback = completeCallback;
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
