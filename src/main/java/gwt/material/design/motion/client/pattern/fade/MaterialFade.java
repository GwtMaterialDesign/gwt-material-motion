package gwt.material.design.motion.client.pattern.fade;

import gwt.material.design.motion.client.pattern.AbstractTransitionPattern;
import gwt.material.design.motion.client.pattern.TransitionSet;
import gwt.material.design.motion.client.pattern.fade.transition.FadeEnterTransition;
import gwt.material.design.motion.client.pattern.fade.transition.FadeExitTransition;

public class MaterialFade extends AbstractTransitionPattern {

    protected static MaterialFade instance;

    @Override
    public TransitionSet getEnterTransition() {
        return new FadeEnterTransition();
    }

    @Override
    public TransitionSet getExitTransition() {
        return new FadeExitTransition();
    }

    public static MaterialFade getInstance() {
        if (instance == null) {
            return new MaterialFade();
        }
        return instance;
    }
}
