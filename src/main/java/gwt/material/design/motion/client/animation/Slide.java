package gwt.material.design.motion.client.animation;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Axis;

public class Slide extends TransformAnimation<String> {

    protected Axis axis;

    public Slide(Widget widget) {
        this(widget, Axis.HORIZONTAL);
    }

    public Slide(Widget widget, Axis axis) {
        super(widget, axis == Axis.HORIZONTAL ? TransformProperty.TRANSLATE_X : TransformProperty.TRANSLATE_Y);

        setAxis(axis);
    }

    public Axis getAxis() {
        return axis;
    }

    public void setAxis(Axis axis) {
        this.axis = axis;
    }
}
