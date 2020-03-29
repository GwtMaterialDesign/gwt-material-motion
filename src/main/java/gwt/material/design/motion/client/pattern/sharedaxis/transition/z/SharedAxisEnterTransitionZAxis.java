package gwt.material.design.motion.client.pattern.sharedaxis.transition.z;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.sharedaxis.MaterialSharedAxis;

public class SharedAxisEnterTransitionZAxis extends EnterTransition<MaterialSharedAxis> {

    @Override
    public void init(MaterialSharedAxis sharedAxis) {
        MaterialWidget source = sharedAxis.getSource();
        MaterialWidget target = sharedAxis.getTarget();

        // Target or Incoming elements fade in
        register(new FadeIn(target)
            .delay(90)
            .duration(210));

        // Source or Outgoing elements fade out
        register(new FadeOut(source)
            .duration(90)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        // Target or Incoming elements scale from 80% to 100%
        register(new Scale(target)
            .duration(300)
            .from(0.8)
            .to(1.0));

        // Source or Outgoing elements scale from 100% to 110%
        register(new Scale(source)
            .duration(300)
            .from(1.0)
            .to(1.1));
    }
}
