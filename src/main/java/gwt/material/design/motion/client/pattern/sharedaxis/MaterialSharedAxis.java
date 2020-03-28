package gwt.material.design.motion.client.pattern.sharedaxis;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.config.HasEnterTransition;
import gwt.material.design.motion.client.config.HasExitTransition;
import gwt.material.design.motion.client.pattern.base.SharedElementPattern;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.SharedAxisTransitionRegistry;

public class MaterialSharedAxis extends SharedElementPattern
    implements HasEnterTransition, HasExitTransition, HasSharedAxisType {

    protected SharedAxisType axisType = SharedAxisType.X_AXIS;
    protected EnterTransition enterTransition;
    protected SharedAxisTransitionRegistry registry = new SharedAxisTransitionRegistry();
    protected ExitTransition exitTransition;


    public MaterialSharedAxis(MaterialWidget source, MaterialWidget target) {
        this(source, target, SharedAxisType.Y_AXIS);
    }

    public MaterialSharedAxis(MaterialWidget source, MaterialWidget target, SharedAxisType axisType) {
        super(source, target);

        setSharedAxisType(axisType);
        init();
    }

    @Override
    public void init() {
        super.init();

        enterTransition = registry.getEnterTransition(axisType);
        exitTransition = registry.getExitTransition(axisType);

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

    @Override
    public void setSharedAxisType(SharedAxisType axisType) {
        this.axisType = axisType;
    }

    @Override
    public SharedAxisType getSharedAxisType() {
        return axisType;
    }
}
