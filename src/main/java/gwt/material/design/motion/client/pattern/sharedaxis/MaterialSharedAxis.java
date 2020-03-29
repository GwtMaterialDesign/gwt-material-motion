package gwt.material.design.motion.client.pattern.sharedaxis;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionRegistry;

public class MaterialSharedAxis {

    public static SharedAxisTransitionRegistry registry = new SharedAxisTransitionRegistry();

    public static void animate(Widget widget, SharedAxisType sharedAxisType, boolean enter, boolean forward) {
        if (enter) {
            registry.getEnterTransition(sharedAxisType, forward).call(widget);
        } else {
            registry.getExitTransition(sharedAxisType, forward).call(widget);
        }
    }

    public static void animate(Widget source, Widget target, SharedAxisType axisType, boolean forward) {
        animate(source, axisType, false, forward);
        animate(target, axisType, true, forward);
    }
}
