package gwt.material.design.motion.client.pattern.fade;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.motion.client.pattern.fade.transition.FadeEnterTransition;
import gwt.material.design.motion.client.pattern.fade.transition.FadeExitTransition;

public class MaterialFade {

    public static void enter(Widget widget) {
        new FadeEnterTransition().call(widget);
    }

    public static void exit(Widget widget) {
        new FadeExitTransition().call(widget);
    }
}
