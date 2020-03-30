package gwt.material.design.motion.client.pattern;

import com.google.gwt.user.client.ui.Widget;

public interface TransitionPattern {

    void animate(Widget source, Widget target);
    void enter(Widget widget);
    void exit(Widget widget);
    TransitionSet getEnterTransition();
    TransitionSet getExitTransition();
}
