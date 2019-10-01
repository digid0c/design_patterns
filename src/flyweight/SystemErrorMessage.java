package flyweight;

/**
 * This is a concrete Flyweight class. It's intrinsic (immutable shared) state is represented by template and baseUrl
 * objects. It's extrinsic (mutable, provided by client) state is represented by errorCode object. Objects of this class
 * should and must be cached by outer container (factory for example).
 */
public class SystemErrorMessage implements ErrorMessage {

    private final String template;
    private final String baseUrl;

    public SystemErrorMessage(String template, String baseUrl) {
        this.template = template;
        this.baseUrl = baseUrl;
    }

    @Override
    public String getText(String errorCode) {
        return template.replace("$errorCode", errorCode) + baseUrl + errorCode;
    }

    public String getTemplate() {
        return template;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
