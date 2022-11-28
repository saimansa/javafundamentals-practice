public class Methods {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);

        }
        int result = addTwoNumbers(5, 2);
        System.out.println("the result was" + " " + result);

    }

    public static int addTwoNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
        myName();

        if (number1 == 0) {
            return -1;

        } else{
            return number1 + number2;
        }
    }
    public static void myName () {
        System.out.println("my name is manasa");

    }
}