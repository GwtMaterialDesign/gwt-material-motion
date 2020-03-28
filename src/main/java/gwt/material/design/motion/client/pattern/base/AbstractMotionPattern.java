package gwt.material.design.motion.client.pattern.base;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.SimpleEventBus;
import gwt.material.design.motion.client.events.HasMotionHandlers;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionInitEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;

public abstract class AbstractMotionPattern extends SimpleEventBus
    implements MotionPattern, HasMotionHandlers {

    @Override
    public void init() {
        MotionInitEvent.fire(this);
    }

    @Override
    public void started() {
        MotionStartedEvent.fire(this);
    }

    @Override
    public void completed() {
        MotionCompletedEvent.fire(this);
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
    public HandlerRegistration addMotionCompletedHandler(MotionCompletedEvent.MotionCompletedHandler handler) {
        return addHandler(MotionCompletedEvent.TYPE, handler);
    }
}
