package gwt.material.design.motion.client.pattern.fadethrough;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;
import gwt.material.design.motion.client.events.MotionStartedEvent;

public class FadeThroughEnterTransition extends EnterTransition<MaterialFadeThrough> {

    @Override
    public void init(MaterialFadeThrough pattern) {
        MaterialWidget source = pattern.getSource();
        MaterialWidget target = pattern.getTarget();

        register(new FadeOut(source)
            .startCallback(() -> MotionStartedEvent.fire(pattern))
            .duration(80)
            .completeCallback(() -> {
                source.setVisible(false);
                target.setVisible(true);
            }));

        register(new FadeIn(target)
            .delay(80)
            .duration(220));

        register(new Scale(target)
            .delay(80)
            .duration(220)
            .from(0.92)
            .to(1.0)
            .completeCallback(() -> MotionCompletedEvent.fire(pattern)));
    }
}
