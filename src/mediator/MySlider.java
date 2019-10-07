package mediator;

import javafx.scene.control.Slider;

public class MySlider extends Slider implements UIControl {

    private UIMediator mediator;
    private boolean updateByMediator;

    public MySlider(UIMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);

        this.setMin(0);
        this.setMax(50);
        this.setBlockIncrement(5);

        //Observer pattern can be used to notify Mediator about particular object's state change
        this.valueProperty().addListener(((observable, oldValue, newValue) -> {
            if (!updateByMediator) {
                mediator.valueChanged(this);
            }
        }));
    }

    @Override
    public void controlChanged(UIControl control) {
        updateByMediator = true;
        try {
            double valueToSet = Double.valueOf(control.getControlValue());
            this.setValue(valueToSet);
        } catch (NumberFormatException e) {
            this.setValue(13);
        }
        updateByMediator = false;
    }

    @Override
    public String getControlValue() {
        return String.valueOf(this.getValue());
    }
}
