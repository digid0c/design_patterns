package flyweight;

/**
 * This is a concrete unshared Flyweight class. It's state cannot be split into intrinsic and extrinsic parts
 * i.e. it holds the entire state within itself. Objects of this class ignore the extrinsic state provided by client
 * and cannot be cached because their state is mutable. Or you can use Object Pool pattern to cache them, which requires
 * to reset mutable state each time object is returned to the pool.
 */
public class UserBannedErrorMessage implements ErrorMessage {

    private String message;

    public UserBannedErrorMessage() {
        this.message = "Cannot access requested resource. User is banned. Please contact your administrator.";
    }

    @Override
    public String getText(String errorCode) {
        //extrinsic state is ignored
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
