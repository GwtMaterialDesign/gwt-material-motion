package gwt.material.design.motion.client.pattern.sharedaxis.transition.x;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedXAxisEnterTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        // Target or Incoming Elements fade in
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(90)
            .duration(210)
            .animate();

        // Target or Incoming Elements slide 20px horizontally
        new Slide(widget, Axis.HORIZONTAL)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .delay(90)
            .from(isForward() ? "20px" : "-20px")
            .to("0px")
            .duration(210)
            .animate();
    }
}
