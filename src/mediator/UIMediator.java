package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Objects encapsulated by mediator are not obliged to be of the same type / implement common interface. Those could
 * be from completely different hierarchies. UIControl interface is used here just for simplicity.
 */
public class UIMediator {

    private List<UIControl> controlObjects = new ArrayList<>();

    public void register(UIControl control) {
        controlObjects.add(control);
    }

    public void valueChanged(UIControl control) {
        controlObjects.stream()
                .filter(controlObject -> !controlObject.equals(control))
                .forEach(controlObject -> controlObject.controlChanged(control));
    }
}
