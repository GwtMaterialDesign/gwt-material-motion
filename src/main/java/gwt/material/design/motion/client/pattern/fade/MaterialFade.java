package gwt.material.design.motion.client.pattern.fade;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.motion.client.pattern.fade.transition.FadeEnterTransition;
import gwt.material.design.motion.client.pattern.fade.transition.FadeExitTransition;

public class MaterialFade {

    public static void animate(Widget widget, boolean enter) {
        if (enter) {
            new FadeEnterTransition().call(widget);
        } else {
            new FadeExitTransition().call(widget);
        }
    }
}
