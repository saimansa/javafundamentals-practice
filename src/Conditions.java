public class Conditions {
    public static void main(String[] args)
    {
        int testScore = 100;
         if(testScore>50)
         {
             System.out.println("pass");
         }
         else if (testScore == 50)
        {
            System.out.println("not sure");
        }
         else
         {
             System.out.println("fail");
         }

         switch (testScore){
             case 0:
                 System.out.println("did you take test?");
                 System.out.println("scored 0");
                 break;
             case 100:
                 System.out.println("you scored 100");
                 break;
             default:
                 System.out.println("average");
                 break;

    }
        if ( testScore>50 && testScore%10 == 0){
            System.out.println("you passed with a score ending 0");
        }

    }
}
