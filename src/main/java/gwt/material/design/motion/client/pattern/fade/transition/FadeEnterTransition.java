package gwt.material.design.motion.client.pattern.fade.transition;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.events.MotionStartedEvent;
import gwt.material.design.motion.client.pattern.fade.MaterialFade;

public class FadeEnterTransition extends EnterTransition<MaterialFade> {
    
    @Override
    public void init(MaterialFade pattern) {
        MaterialWidget target = pattern.getTarget();
        register(new FadeIn(target)
            .startCallback(() -> {
                target.setVisible(true);
                MotionStartedEvent.fire(pattern);
            })
            .delay(20)
            .duration(220));

        register(new Scale(target)
            .delay(20)
            .duration(150)
            .from(0.80)
            .to(1.0));
    }
}
