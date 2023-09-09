package codecleanwithcreatmethod;

public class CreatMethod {
    public static void main(String[] args) {
        String meassage = greetUser("Lei","Gao");
        System.out.println(meassage);
    }
    public static String greetUser(String firstName,String lastName){
        return "Hello "+firstName+ " "+lastName;
    }
}
