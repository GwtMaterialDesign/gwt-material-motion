package gwt.material.design.motion.client.pattern.sharedaxis.transition.y;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.jquery.client.api.Functions;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.pattern.TransitionSet;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedYAxisExitTransition extends SharedAxisTransitionSet {


    @Override
    public void call(Widget widget, Functions.Func startCallback, Functions.Func completeCallback) {
        // Source or Outgoing elements fade out
        new FadeOut(widget)
            .duration(90)
            .completeCallback(() -> widget.setVisible(false))
            .animate();

        // Source or Outgoing elements slide 20px (30dp) vertically
        new Slide(widget, Axis.VERTICAL)
            .startCallback(startCallback)
            .completeCallback(completeCallback)
            .duration(90)
            .from("0px")
            .to(isForward() ? "-20px" : "20px")
            .animate();
    }
}
