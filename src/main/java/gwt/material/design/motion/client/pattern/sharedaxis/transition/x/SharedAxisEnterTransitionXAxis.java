package gwt.material.design.motion.client.pattern.sharedaxis.transition.x;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.sharedaxis.MaterialSharedAxis;

public class SharedAxisEnterTransitionXAxis extends EnterTransition<MaterialSharedAxis> {

    @Override
    public void init(MaterialSharedAxis sharedAxis) {
        MaterialWidget source = sharedAxis.getSource();
        MaterialWidget target = sharedAxis.getTarget();

        // Source or Outgoing Elements fade out
        register(new FadeOut(source)
            .startCallback(() -> MotionStartedEvent.fire(sharedAxis))
            .duration(90)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        // Source or Outgoing Elements slide 20px horizontally
        register(new Slide(source, Axis.HORIZONTAL)
            .duration(90)
            .from("0px")
            .to("-20px"));

        // Target or Incoming Elements fade in
        register(new FadeIn(target)
            .delay(90)
            .duration(210));

        // Target or Incoming Elements slide 20px horizontally
        register(new Slide(target, Axis.HORIZONTAL)
            .delay(90)
            .from("20px")
            .to("0px")
            .duration(210)
            .completeCallback(() -> MotionCompletedEvent.fire(sharedAxis)));
    }
}
