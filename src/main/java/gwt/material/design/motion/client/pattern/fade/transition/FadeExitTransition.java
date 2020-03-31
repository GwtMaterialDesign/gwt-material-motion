package gwt.material.design.motion.client.pattern.fade.transition;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.pattern.TransitionSet;

public class FadeExitTransition implements TransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        new FadeOut(widget)
            .startCallback(startCallback)
            .delay(20)
            .duration(75)
            .completeCallback(() -> {
                widget.setVisible(false);
                if (completeCallback != null) {
                    completeCallback.call();
                }
            })
            .animate();
    }
}
