package gwt.material.design.motion.client.pattern.fade;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.config.HasExitTransition;
import gwt.material.design.motion.client.pattern.base.StandaloneElementPattern;
import gwt.material.design.motion.client.pattern.fade.transition.FadeEnterTransition;
import gwt.material.design.motion.client.pattern.fade.transition.FadeExitTransition;

public class MaterialFade extends StandaloneElementPattern implements HasEnterTransition, HasExitTransition {

    protected FadeEnterTransition enterTransition = new FadeEnterTransition();
    protected FadeExitTransition exitTransition = new FadeExitTransition();

    public MaterialFade(MaterialWidget target) {
        super(target);

        init();
    }

    @Override
    public void init() {
        super.init();
        enterTransition.init(this);
        exitTransition.init(this);
    }

    @Override
    public EnterTransition getEnterTransition() {
        return enterTransition;
    }

    @Override
    public ExitTransition getExitTransition() {
        return exitTransition;
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
