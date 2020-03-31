package gwt.material.design.motion.client.pattern.fadethrough.transition;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.pattern.TransitionSet;

public class FadeThroughExitTransition implements TransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        new FadeOut(widget)
            .startCallback(startCallback)
            .duration(80)
            .completeCallback(() -> {
                //widget.setVisible(false);

                if (completeCallback != null) {
                    completeCallback.call();
                }
            })
            .animate();
    }
}
