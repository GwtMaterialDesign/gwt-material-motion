package gwt.material.design.motion.client.config;

import gwt.material.design.client.ui.animate.Animation;
import gwt.material.design.motion.client.pattern.base.MotionPattern;

public interface TransitionCallback<T extends MotionPattern> {

    void init(T pattern);
    void call();
    void register(Animation animation);
}
