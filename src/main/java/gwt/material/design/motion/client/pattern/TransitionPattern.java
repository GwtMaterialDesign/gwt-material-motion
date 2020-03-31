package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;

public interface TransitionPattern {

    void animate(Widget source, Widget target);

    void enter(Widget widget, Functions.Func startCallback, Functions.Func completeCallback);

    default void enter(Widget widget) {
        enter(widget, null, null);
    }

    default void enter(Widget widget, Functions.Func completeCallback) {
        enter(widget, null, completeCallback);
    }

    void exit(Widget widget, Functions.Func startCallback, Functions.Func completeCallback);

    default void exit(Widget widget) {
        exit(widget, null, null);
    }

    default void exit(Widget widget, Functions.Func completeCallback) {
        exit(widget, null, completeCallback);
    }

    TransitionSet getEnterTransition();

    TransitionSet getExitTransition();
}
