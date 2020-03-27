package gwt.material.design.motion.client.pattern;

import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.motion.client.config.HasEnterTransition;

public abstract class SharedElementPattern extends AbstractMotionPattern
    implements HasEnterTransition {

    protected MaterialWidget source;
    protected MaterialWidget target;

    public SharedElementPattern(MaterialWidget source, MaterialWidget target) {
        this.source = source;
        this.target = target;
    }

    public MaterialWidget getSource() {
        return source;
    }

    public void setSource(MaterialWidget source) {
        this.source = source;
    }

    public MaterialWidget getTarget() {
        return target;
    }

    public void setTarget(MaterialWidget target) {
        this.target = target;
    }
}