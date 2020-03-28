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
        register(new FadeOut(source)
            .startCallback(() -> MotionStartedEvent.fire(sharedAxis))
            .duration(90)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        register(new Slide(source, Axis.VERTICAL)
            .duration(90)
            .from("0px")
            .to("-20px"));

        register(new FadeIn(target)
            .delay(90)
            .duration(210));

        register(new Slide(target, Axis.VERTICAL)
            .delay(90)
            .from("20px")
            .to("0px")
            .duration(210)
            .completeCallback(() -> MotionCompletedEvent.fire(sharedAxis)));
    }
}
