public class loops {

    public static void main(String[] args) {
        for(int i = 40; i<=45; i++)
        {
            System.out.println(i * 2);
        }

        double[] myArray = {1.2,3.4,5.5};
        for(int i=0; i<=myArray.length; i++){
//            System.out.println(myArray[i]);

        }

        int counter = 0;
        while (counter < 5)
        {
            System.out.println("hello" + counter);
            counter++;
        }
    }

}
