public class Variables {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(i);
        int j;
        j = 2;
        System.out.println(j);
        long myVariable = 20L;
        long anotherVariableWhichIsLong = 3000000000000000L;
        double myDouble = 17.2;
        float myFloat = 17.3F;

    //        var someOtherVariable = 17;
    //        someOtherVariable = 20.3; //because someOtherVariable is considered as int

        int first = 50;
        int second = 100;
        int third = first;
        first = 65;  //we don't have to define an already assigned datatype.
        System.out.println("first "  +   first);
        System.out.println("second " +   second);
        System.out.println("third "  +   third);

        //do 100 divided by 50: which is 2

        int myValue = second/third;
        System.out.println(myValue);
        System.out.println("100 divided by 50 is " + myValue);

        // divide 100/65 is 1.5

        int myExpectedValueIsOnePointFive1 = second/first;
        System.out.println("100 divided by 50 is " + myExpectedValueIsOnePointFive1);

        double myExpectedValueIsOnePointFive = second/first;
        System.out.println("100 divided by 50 is " + myExpectedValueIsOnePointFive);

        double myExpectedValueIsOnePointFiveF = (double) second / first;
        System.out.println("100 divided by 50 is " + myExpectedValueIsOnePointFiveF);

        System.out.println(first + 1);
        System.out.println(first - 1);
        System.out.println(first * 4);

        int myAge = 26;
        myAge++; //increments by 1
        System.out.println(myAge);
        System.out.println(myAge++);
        System.out.println(myAge);

        boolean imYoungerThan20 = false;
        char myNameStartsWithM = 'M';

        int[] array = {1,2,3,4};
        System.out.println(array[0]);
//        System.out.println(array[6]);
        System.out.println(array[3]);

        array[0] = 88;
        System.out.println(array[0]);


    }
}
