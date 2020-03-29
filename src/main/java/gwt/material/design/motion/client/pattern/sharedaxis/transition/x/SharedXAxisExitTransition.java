package gwt.material.design.motion.client.pattern.sharedaxis.transition.x;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedXAxisExitTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget) {
        new FadeOut(widget)
            .duration(90)
            .completeCallback(() -> widget.setVisible(false))
            .animate();

        new Slide(widget, Axis.HORIZONTAL)
            .duration(90)
            .from("0px")
            .to(isForward() ? "-20px" : "20px")
            .animate();
    }
}
