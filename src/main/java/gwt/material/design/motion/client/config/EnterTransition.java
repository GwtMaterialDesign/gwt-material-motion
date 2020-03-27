package gwt.material.design.motion.client.config;

import gwt.material.design.client.ui.animate.Animation;

import java.util.ArrayList;
import java.util.List;

public class EnterTransition implements TransitionCallback {

    protected List<Animation> animations = new ArrayList<>();

    public EnterTransition() {
    }

    public void register(Animation animation) {
        this.animations.add(animation);
    }

    @Override
    public void call() {
        animations.forEach(animation -> animation.animate());
    }
}
