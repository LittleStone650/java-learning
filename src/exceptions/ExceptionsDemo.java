package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }







//    ===================try except ================
//    public static void show() {
////        sayHello(null);
//        try (
//                var reader = new FileReader("file.txt");
//                var writer = new FileWriter("....");
//        ){
//
//            System.out.println("file open");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        }
//        catch (IOException | ParseException e) {
//            System.out.println("could not read data");
//        }
//    }



    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }


}
