package gwt.material.design.motion.client.pattern.sharedaxis.transition.y;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.sharedaxis.MaterialSharedAxis;

public class SharedAxisEnterTransitionYAxis extends EnterTransition<MaterialSharedAxis> {

    @Override
    public void init(MaterialSharedAxis sharedAxis) {
        MaterialWidget source = sharedAxis.getSource();
        MaterialWidget target = sharedAxis.getTarget();

        // Source or Outgoing elements fade out
        register(new FadeOut(source)
            .startCallback(() -> MotionStartedEvent.fire(sharedAxis))
            .duration(90)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        // Source or Outgoing elements slide 20px (30dp) vertically
        register(new Slide(source, Axis.VERTICAL)
            .duration(90)
            .from("0px")
            .to("-20px"));

        // Incoming or Target elements fade in
        register(new FadeIn(target)
            .delay(90)
            .duration(210));

        // Incoming or Target elements slide 20px (30dp) vertically
        register(new Slide(target, Axis.VERTICAL)
            .delay(90)
            .from("20px")
            .to("0px")
            .duration(210)
            .completeCallback(() -> MotionCompletedEvent.fire(sharedAxis)));
    }
}
