package gwt.material.design.motion.client.animation;

//TODO: Migrate to GMD later on
public enum TransformProperty {
    SCALE("scale"),
    TRANSLATE_X("translateX"),
    TRANSLATE_Y("translateY");

    private String name;

    TransformProperty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}