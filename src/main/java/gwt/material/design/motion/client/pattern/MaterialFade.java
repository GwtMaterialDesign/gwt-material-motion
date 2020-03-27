package gwt.material.design.motion.client.pattern;

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.animation.FadeIn;
import gwt.material.design.motion.client.animation.FadeOut;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.config.HasExitTransition;

public class MaterialFade extends StandaloneElementPattern implements HasEnterTransition, HasExitTransition {

    protected EnterTransition enterTransition = new EnterTransition();
    protected ExitTransition exitTransition = new ExitTransition();

    public MaterialFade(MaterialWidget target) {
        super(target);

        init();
    }

    @Override
    public void init() {
        target.setVisibility(Style.Visibility.HIDDEN);
        enterTransition.register(new FadeIn(target)
            .duration(400)
            .callback(() -> target.setVisibility(Style.Visibility.VISIBLE)));

        exitTransition.register(new FadeOut(target)
            .duration(400)
            .callback(() -> target.setVisibility(Style.Visibility.HIDDEN)));
    }

    @Override
    public void enterTransition() {
        enterTransition.call();
    }

    @Override
    public void exitTransition() {
        exitTransition.call();
    }
}
