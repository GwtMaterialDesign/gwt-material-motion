package gwt.material.design.motion.client.pattern.sharedaxis.transition;

import gwt.material.design.motion.client.pattern.sharedaxis.SharedAxisType;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedXAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.x.SharedXAxisExitTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedYAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.y.SharedYAxisExitTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedZAxisEnterTransition;
import gwt.material.design.motion.client.pattern.sharedaxis.transition.z.SharedZAxisExitTransition;

import java.util.HashMap;
import java.util.Map;

public class SharedAxisTransitionRegistry {

    protected static Map<SharedAxisType, SharedAxisTransitionSet> enterTransitionMap = new HashMap<>();
    protected static Map<SharedAxisType, SharedAxisTransitionSet> exitTransitionMap = new HashMap<>();

    static {
        enterTransitionMap.put(SharedAxisType.X_AXIS, new SharedXAxisEnterTransition());
        enterTransitionMap.put(SharedAxisType.Y_AXIS, new SharedYAxisEnterTransition());
        enterTransitionMap.put(SharedAxisType.Z_AXIS, new SharedZAxisEnterTransition());

        exitTransitionMap.put(SharedAxisType.X_AXIS, new SharedXAxisExitTransition());
        exitTransitionMap.put(SharedAxisType.Y_AXIS, new SharedYAxisExitTransition());
        exitTransitionMap.put(SharedAxisType.Z_AXIS, new SharedZAxisExitTransition());
    }

    public SharedAxisTransitionSet getEnterTransition(SharedAxisType axisType, boolean forward) {
        SharedAxisTransitionSet sharedAxisTransitionSet = enterTransitionMap.get(axisType);
        sharedAxisTransitionSet.setForward(forward);
        return sharedAxisTransitionSet;
    }

    public SharedAxisTransitionSet getExitTransition(SharedAxisType axisType, boolean forward) {
        SharedAxisTransitionSet sharedAxisTransitionSet = exitTransitionMap.get(axisType);
        sharedAxisTransitionSet.setForward(forward);
        return sharedAxisTransitionSet;
    }
}
