package gwt.material.design.motion.client.pattern.sharedaxis.transition.x;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Axis;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Slide;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.sharedaxis.MaterialSharedAxis;

public class SharedAxisExitTransitionXAxis extends ExitTransition<MaterialSharedAxis> {

    @Override
    public void init(MaterialSharedAxis sharedAxis) {
        MaterialWidget source = sharedAxis.getSource();
        MaterialWidget target = sharedAxis.getTarget();

        register(new FadeOut(target)
            .startCallback(() -> MotionStartedEvent.fire(sharedAxis))
            .duration(90)
            .completeCallback(() -> {
                target.setVisible(false);
                source.setVisible(true);
            }));

        register(new Slide(target, Axis.HORIZONTAL)
            .duration(90)
            .to("20px"));

        register(new FadeIn(source)
            .delay(90)
            .duration(210));

        register(new Slide(source, Axis.HORIZONTAL)
            .delay(90)
            .to("0px")
            .duration(210)
            .completeCallback(() -> MotionCompletedEvent.fire(sharedAxis)));
    }
}
