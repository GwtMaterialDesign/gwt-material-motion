package gwt.material.design.motion.client.config;

import gwt.material.design.client.ui.animate.Animation;

import java.util.ArrayList;
import java.util.List;

public class ExitTransition implements TransitionCallback {

    protected List<Animation> animations = new ArrayList<>();

    public ExitTransition() {
    }

    public void register(Animation animation) {
        this.animations.add(animation);
    }

    @Override
    public void call() {
        animations.forEach(animation -> animation.animate());
    }
}
