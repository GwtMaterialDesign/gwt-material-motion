package gwt.material.design.motion.client.pattern;

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.animate.Transition;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.animation.Scale;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.config.HasExitTransition;
import gwt.material.design.motion.client.pattern.base.StandaloneElementPattern;

public class MaterialFade extends StandaloneElementPattern
    implements HasEnterTransition, HasExitTransition {

    protected EnterTransition enterTransition = new EnterTransition();
    protected ExitTransition exitTransition = new ExitTransition();

    public MaterialFade(MaterialWidget target) {
        super(target);

        init();
    }

    @Override
    public void init() {
        /*enterTransition.register(new FadeIn(target)
            .duration(1000));

        enterTransition.register(new Scale(target)
            .duration(1000)
            .from(0)
            .to(1));*/
        enterTransition.register(new FadeIn(target)
            .startCallback(() -> target.setVisible(true))
            .delay(20)
            .duration(220));

        //TODO: Delay with 0 bug
        enterTransition.register(new Scale(target)
            .delay(20)
            .duration(150)
            .from(0.80)
            .to(1));

        exitTransition.register(new FadeOut(target)
            .delay(20)
            .duration(75)
            .completeCallback(() -> {
                target.setVisible(false);
            }));
    }

    @Override
    public void completed() {

    }

    @Override
    public void enter() {
        enterTransition.call();
    }

    @Override
    public void exit() {
        exitTransition.call();
    }
}
