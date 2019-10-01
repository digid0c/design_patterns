package flyweight;

import flyweight.ErrorMessageFactory.ErrorType;

public class Client {

    public static void main(String[] args) {
        System.out.println(ErrorMessageFactory.getMessage(ErrorType.PAGE_NOT_FOUND_ERROR).getText("404"));
        System.out.println("-----------------------");

        System.out.println(ErrorMessageFactory.getMessage(ErrorType.INTERNAL_SERVER_ERROR).getText("500"));
        System.out.println("-----------------------");

        System.out.println(ErrorMessageFactory.getMessage(ErrorType.USER_BANNED_ERROR).getText("601"));
        System.out.println("-----------------------");

        System.out.println("Cache size is " + ErrorMessageFactory.getCacheSize());
    }
}
