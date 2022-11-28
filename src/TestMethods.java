public class TestMethods {
    public static void main(String[] args) {
        int result = whoIsOlder(4 , 5);
        System.out.println(result);
     double result2 = addThreeNumbers( 1 , 2, 3.5);
        System.out.println(result2);

        //instantiation of the class NameManager new NameManager is the working copy of the class
        NameManager nameManager = new NameManager();
        NameManager nameManager2 = new NameManager();

        System.out.println(nameManager.getFirstName());
        System.out.println(nameManager.getLastName());

        NameManager.doSomething(); //I can call it without instantiating the class
        nameManager.doSomething(); //can also be called with the instances

        System.out.println(nameManager.fullName);

    }

    public static double addThreeNumbers (double val1, double val2, double val3) {
        double result2 = val1 + val2 + val3;
        return result2;

    }
    public static int whoIsOlder(int number1 , int number2 ){

        if(number1>number2)
        {
            return number1;
        }
        else
        {
            return number2;
        }

    }
    public static boolean longerThan5( String firstName ){

//        if(firstName.length() >= 6){
//            return true;
//        }
//        else{
//            return false;
//        }

//        return firstName.length() >= 6 ? true : false;

        return firstName.length() >= 6;

    }

    }

