package adapter.class_adapter_impl;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        return String.join("\n", customer.getName(), customer.getDesignation(), customer.getAddress());
    }
}
