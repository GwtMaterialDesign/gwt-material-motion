package gwt.material.design.motion.client.pattern.base;

import gwt.material.design.client.base.MaterialWidget;

public abstract class StandaloneElementPattern extends AbstractMotionPattern {

    protected MaterialWidget target;

    public StandaloneElementPattern(MaterialWidget target) {
        this.target = target;
    }

    public MaterialWidget getTarget() {
        return target;
    }
}
