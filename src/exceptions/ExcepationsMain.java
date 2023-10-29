package exceptions;

import java.io.IOException;

public class ExcepationsMain {
    public static void main(String[] args) {

        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An unexpected error occurred");
        }
    }
    }
