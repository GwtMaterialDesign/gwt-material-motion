package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;

public abstract class AbstractTransitionPattern implements TransitionPattern {

    @Override
    public void animate(Widget source, Widget target) {
        exit(source);
        enter(target);
    }

    @Override
    public void enter(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        getEnterTransition().call(widget, startCallback, completeCallback);
    }

    @Override
    public void exit(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        getExitTransition().call(widget, startCallback, completeCallback);
    }
}
