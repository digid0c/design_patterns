package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    private static final Map<ErrorType, ErrorMessage> MESSAGES_CACHE = new HashMap<>();

    public enum ErrorType {
        PAGE_NOT_FOUND_ERROR, INTERNAL_SERVER_ERROR, USER_BANNED_ERROR
    }

    public static ErrorMessage getMessage(ErrorType errorType) {
        switch (errorType) {
            case PAGE_NOT_FOUND_ERROR: return MESSAGES_CACHE.computeIfAbsent(errorType,
                    error -> new SystemErrorMessage("Page not found because of $errorCode code error. Please refer to: ", "http://mysite.com/?error="));
            case INTERNAL_SERVER_ERROR: return MESSAGES_CACHE.computeIfAbsent(errorType,
                    error -> new SystemErrorMessage("An internal server error of code $errorCode occurred. Please refer to: ", "http://mysite.com/?error="));
            case USER_BANNED_ERROR: return new UserBannedErrorMessage();
            default: throw new IllegalArgumentException("Error type is unknown!");
        }
    }

    public static int getCacheSize() {
        return MESSAGES_CACHE.size();
    }
}
