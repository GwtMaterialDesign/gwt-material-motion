package gwt.material.design.motion.client.pattern.sharedaxis;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.config.HasExitTransition;
import gwt.material.design.motion.client.pattern.base.SharedElementPattern;

public class MaterialSharedAxis extends SharedElementPattern implements HasEnterTransition, HasExitTransition {

    protected SharedAxisEnterTransition enterTransition = new SharedAxisEnterTransition();
    protected SharedAxisExitTransition exitTransition = new SharedAxisExitTransition();

    public MaterialSharedAxis(MaterialWidget source, MaterialWidget target) {
        super(source, target);

        init();
    }

    @Override
    public void init() {
        super.init();

        enterTransition.init(this);
        exitTransition.init(this);
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
