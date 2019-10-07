package mediator;

import javafx.scene.control.TextField;

public class TextBox extends TextField implements UIControl {

    private UIMediator mediator;
    private boolean updateByMediator;

    public TextBox(UIMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
        this.setText("Text box");

        //Observer pattern can be used to notify Mediator about particular object's state change
        this.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!updateByMediator) {
                mediator.valueChanged(this);
            }
        });
    }

    @Override
    public void controlChanged(UIControl control) {
        updateByMediator = true;
        this.setText(control.getControlValue());
        updateByMediator = false;
    }

    @Override
    public String getControlValue() {
        return this.getText();
    }
}
