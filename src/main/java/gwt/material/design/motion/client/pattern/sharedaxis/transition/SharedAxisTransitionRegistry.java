package gwt.material.design.motion.client.pattern.sharedaxis.transition;

import gwt.material.design.motion.client.config.EnterTransition;
import gwt.material.design.motion.client.config.ExitTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.SharedAxisType;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedAxisEnterTransitionXAxis;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedAxisExitTransitionXAxis;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedAxisEnterTransitionYAxis;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedAxisExitTransitionYAxis;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedAxisEnterTransitionZAxis;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedAxisExitTransitionZAxis;

import java.util.HashMap;
import java.util.Map;

public class SharedAxisTransitionRegistry {

    protected static Map<SharedAxisType, EnterTransition> enterTransitionMap = new HashMap<>();
    protected static Map<SharedAxisType, ExitTransition> exitTransitionMap = new HashMap<>();

    static {
        enterTransitionMap.put(SharedAxisType.X_AXIS, new SharedAxisEnterTransitionXAxis());
        enterTransitionMap.put(SharedAxisType.Y_AXIS, new SharedAxisEnterTransitionYAxis());
        enterTransitionMap.put(SharedAxisType.Z_AXIS, new SharedAxisEnterTransitionZAxis());

        exitTransitionMap.put(SharedAxisType.X_AXIS, new SharedAxisExitTransitionXAxis());
        exitTransitionMap.put(SharedAxisType.Y_AXIS, new SharedAxisExitTransitionYAxis());
        exitTransitionMap.put(SharedAxisType.Z_AXIS, new SharedAxisExitTransitionZAxis());
    }

    public EnterTransition getEnterTransition(SharedAxisType axisType) {
        return enterTransitionMap.get(axisType);
    }

    public ExitTransition getExitTransition(SharedAxisType axisType) {
        return exitTransitionMap.get(axisType);
    }
}
