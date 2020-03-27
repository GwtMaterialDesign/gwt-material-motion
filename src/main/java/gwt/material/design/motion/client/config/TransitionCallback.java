package gwt.material.design.motion.client.config;

import gwt.material.design.client.ui.animate.Animation;

public interface TransitionCallback {

    void call();
    void register(Animation animation);
}
