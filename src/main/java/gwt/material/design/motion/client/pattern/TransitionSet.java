package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;

public interface TransitionSet {

    void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback);

    default void call(Widget widget) {
        call(widget, null, null);
    }

    default void call(Widget widget, Functions.Func completeCallback) {
        call(widget, null, completeCallback);
    }
}
