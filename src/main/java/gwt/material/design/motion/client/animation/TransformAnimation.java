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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.animate.Animation;
import gwt.material.design.client.ui.animate.debugger.AnimationGlobalConfig;
import gwt.material.design.jquery.client.api.Functions;

public abstract class TransformAnimation<T> implements Animation {

    protected int duration, delay;
    protected Widget widget;
    protected TransformProperty property;
    protected Functions.Func startCallback, completeCallback;
    protected T from;
    protected T to;

    public TransformAnimation(Widget widget, TransformProperty transformProperty) {
        this.widget = widget;
        this.property = transformProperty;
    }

    //TODO: Why we need to add a predefined delay when animation the Transform.
    @Override
    public void animate() {
        if (AnimationGlobalConfig.ENABLE_DEBUGGING) GWT.log(toString());

        if (startCallback != null) fireStartCallback();
        Scheduler.get().scheduleFixedDelay(() -> {
            widget.getElement().getStyle().setProperty("transform", property.getName() + "(" + from + ")");
            Scheduler.get().scheduleFixedDelay(() -> {
                widget.getElement().getStyle().setProperty("transition", duration + "ms");
                widget.getElement().getStyle().setProperty("transform", property.getName() + "(" + to + ")");
                if (completeCallback != null) fireCompleteCallback();
                return false;
            }, delay);
            return false;
        }, 20);
    }

    protected void fireStartCallback() {
        startCallback.call();
    }

    protected void fireCompleteCallback() {
        Scheduler.get().scheduleFixedDelay(() -> {
            completeCallback.call();
            return false;
        }, duration);
    }

    public TransformAnimation<T> duration(int duration) {
        setDuration(duration);
        return this;
    }

    public TransformAnimation<T> delay(int delay) {
        setDelay(delay);
        return this;
    }

    public TransformAnimation<T> completeCallback(Functions.Func completeCallback) {
        setCompleteCallback(completeCallback);
        return this;
    }

    public TransformAnimation<T> startCallback(Functions.Func startCallback) {
        setStartCallback(startCallback);
        return this;
    }

    public TransformAnimation<T> from(T from) {
        setFrom(from);
        return this;
    }

    public TransformAnimation<T> to(T to) {
        setTo(to);
        return this;
    }

    @Override
    public Widget getWidget() {
        return widget;
    }

    @Override
    public void setDelay(int delay) {
        this.delay = (int) (delay * AnimationGlobalConfig.SPEED.getValue());
    }

    @Override
    public int getDelay() {
        return delay;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = (int) (duration * AnimationGlobalConfig.SPEED.getValue());
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

    public T getTo() {
        return to;
    }

    public void setTo(T to) {
        this.to = to;
    }

    public T getFrom() {
        return from;
    }

    public void setFrom(T from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "TransformAnimation{" +
            "duration=" + duration +
            ", delay=" + delay +
            ", widget=" + widget +
            ", property=" + property +
            ", from=" + from +
            ", to=" + to +
            '}';
    }
}
