package gwt.material.design.motion.client.pattern.fade.transition;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.pattern.TransitionSet;

public class FadeEnterTransition implements TransitionSet {

    @Override
    public void call(Widget widget) {
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(20)
            .duration(220)
            .animate();

        new Scale(widget)
            .delay(20)
            .duration(150)
            .from(0.80)
            .to(1.0)
            .animate();
    }
}
