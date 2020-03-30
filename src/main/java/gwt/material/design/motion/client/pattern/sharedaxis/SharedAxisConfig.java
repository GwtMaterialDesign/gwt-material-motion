package gwt.material.design.motion.client.pattern.sharedaxis;

public class SharedAxisConfig {

    private SharedAxisType axisType;
    private boolean forward;

    public SharedAxisConfig(SharedAxisType axisType, boolean forward) {
        this.axisType = axisType;
        this.forward = forward;
    }

    public SharedAxisType getAxisType() {
        return axisType;
    }

    public void setAxisType(SharedAxisType axisType) {
        this.axisType = axisType;
    }

    public boolean isForward() {
        return forward;
    }

    public void setForward(boolean forward) {
        this.forward = forward;
    }
}
