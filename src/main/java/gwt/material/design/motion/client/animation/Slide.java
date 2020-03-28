package gwt.material.design.motion.client.animation;

import com.google.gwt.user.client.ui.Widget;

public class Slide extends TransformAnimation<String> {

    public Slide(Widget widget) {
        super(widget, TransformProperty.TRANSLATE_X);
    }
}
