package gwt.material.design.motion.client.pattern.fade;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.events.MotionCompletedEvent;

public class FadeExitTransition extends ExitTransition<MaterialFade> {

    @Override
    public void init(MaterialFade pattern) {
        MaterialWidget target = pattern.getTarget();
        register(new FadeOut(target)
            .delay(20)
            .duration(75)
            .completeCallback(() -> {
                target.setVisible(false);
                MotionCompletedEvent.fire(pattern);
            }));
    }
}
