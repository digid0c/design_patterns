package mediator;

import javafx.scene.control.Label;

public class MyLabel extends Label implements UIControl {

    private UIMediator mediator;

    public MyLabel(UIMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);

        this.setMinWidth(100);
        this.setText("Label");
    }

    @Override
    public void controlChanged(UIControl control) {
        this.setText(control.getControlValue());
    }

    @Override
    public String getControlValue() {
        return this.getText();
    }
}
