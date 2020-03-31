package gwt.material.design.motion.client.pattern.sharedaxis.transition.y;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedYAxisEnterTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        // Incoming or Target elements fade in
        new FadeIn(widget)
            .startCallback(() -> widget.setVisible(true))
            .delay(90)
            .duration(210)
            .animate();

        // Incoming or Target elements slide 20px (30dp) vertically
        new Slide(widget, Axis.VERTICAL)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .delay(90)
            .from(isForward() ? "20px" : "-20px")
            .to("0px")
            .duration(210)
            .animate();
    }
}
