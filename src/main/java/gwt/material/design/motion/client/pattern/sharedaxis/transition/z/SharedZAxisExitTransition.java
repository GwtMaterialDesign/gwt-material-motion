package gwt.material.design.motion.client.pattern.sharedaxis.transition.z;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionSet;

public class SharedZAxisExitTransition extends SharedAxisTransitionSet {

    @Override
    public void call(Widget widget) {
        // Source or Outgoing elements scale from 100% to 110%
        new Scale(widget)
            .duration(300)
            .from(1.0)
            .to(1.1)
            .animate();

        // Source or Outgoing elements fade out
        new FadeOut(widget)
            .duration(90)
            .completeCallback(() -> {
                widget.setVisible(false);
            })
            .animate();
    }
}
