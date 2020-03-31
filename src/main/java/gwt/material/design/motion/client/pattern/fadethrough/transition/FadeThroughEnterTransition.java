package gwt.material.design.motion.client.pattern.fadethrough.transition;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.pattern.TransitionSet;

public class FadeThroughEnterTransition implements TransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(80)
            .duration(220)
            .animate();

        new Scale(widget)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .delay(80)
            .duration(220)
            .from(0.92)
            .to(1.0)
            .animate();
    }
}
