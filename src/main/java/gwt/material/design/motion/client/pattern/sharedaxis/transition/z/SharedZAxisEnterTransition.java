package gwt.material.design.motion.client.pattern.sharedaxis.transition.z;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedZAxisEnterTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        // Target or Incoming elements fade in
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(90)
            .duration(210)
            .animate();

        // Target or Incoming elements scale from 80% to 100%
        new Scale(widget)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .delay(90) // we dont need delay , seems there's a bug
            .duration(300)
            .from(0.8)
            .to(1.0)
            .animate();
    }
}
