public class NameManager {

    String fullName = "Sai Manasa";

    public String getFirstName(){

        String[] values = fullName.split(" ");
        return values[0];

    }

    public String getLastName(){

        String[] values = fullName.split(" ");
        doSomething();
        return values[values.length - 1];

    }

    public static void doSomething(){
        System.out.println("I will do something");
    }

}
