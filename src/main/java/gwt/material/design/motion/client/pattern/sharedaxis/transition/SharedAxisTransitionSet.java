package gwt.material.design.motion.client.pattern.sharedaxis.transition;

import gwt.material.design.motion.client.pattern.TransitionSet;

public abstract class SharedAxisTransitionSet implements TransitionSet {

    protected boolean forward;

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }
}
