package gwt.material.design.motion.client.pattern.sharedaxis.transition.z;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.sharedaxis.MaterialSharedAxis;

public class SharedAxisExitTransitionZAxis extends ExitTransition<MaterialSharedAxis> {

    @Override
    public void init(MaterialSharedAxis sharedAxis) {
        MaterialWidget source = sharedAxis.getSource();
        MaterialWidget target = sharedAxis.getTarget();

        // Target or Incoming elements fade in
        register(new FadeIn(source)
            .delay(90)
            .duration(210));

        // Source or Outgoing elements fade out
        register(new FadeOut(target)
            .duration(90)
            .completeCallback(() -> {
                target.setVisible(false);
                source.setVisible(true);
            }));

        // Target or Incoming elements scale from 80% to 100%
        register(new Scale(source)
            .delay(90)
            .duration(300)
            .to(1.0));

        // Source or Outgoing elements scale from 100% to 110%
        register(new Scale(target)
            .duration(300)
            .to(1.1));
    }
}
