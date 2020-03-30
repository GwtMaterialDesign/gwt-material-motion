package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractTransitionPattern implements TransitionPattern {

    @Override
    public void animate(Widget source, Widget target) {
        exit(source);
        enter(target);
    }

    @Override
    public void enter(Widget widget) {
        getEnterTransition().call(widget);
    }

    @Override
    public void exit(Widget widget) {
        getExitTransition().call(widget);
    }
}
