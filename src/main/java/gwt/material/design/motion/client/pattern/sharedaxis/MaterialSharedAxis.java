package gwt.material.design.motion.client.pattern.sharedaxis;

import gwt.material.design.motion.client.pattern.AbstractTransitionPattern;
import gwt.material.design.motion.client.pattern.TransitionSet;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionRegistry;

public class MaterialSharedAxis extends AbstractTransitionPattern {

    protected static MaterialSharedAxis instance;
    protected static SharedAxisTransitionRegistry registry = new SharedAxisTransitionRegistry();
    protected SharedAxisConfig config = new SharedAxisConfig(SharedAxisType.X_AXIS, true);

    public MaterialSharedAxis setConfig(SharedAxisConfig config) {
        this.config = config;
        return this;
    }

    @Override
    public TransitionSet getEnterTransition() {
        return registry.getEnterTransition(config.getAxisType(), config.isForward());
    }

    @Override
    public TransitionSet getExitTransition() {
        return registry.getExitTransition(config.getAxisType(), config.isForward());
    }

    public static MaterialSharedAxis getInstance() {
        if (instance == null) {
            instance = new MaterialSharedAxis();
        }
        return instance;
    }
}
