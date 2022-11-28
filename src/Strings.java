public class Strings {
    public static void main(String[] args) {
        String myName = "manasa";
        int length = myName.length();
        System.out.println("my Name is " + myName);
        System.out.println("This has" + length + "characters");
        String myNameUpper = myName.toUpperCase();
        System.out.println("My name is " + myNameUpper);

        String phrase = "Many hands make light work";
        System.out.println(phrase.startsWith("Many"));
        System.out.println(phrase.startsWith("many"));
        System.out.println(phrase.indexOf("light"));

        myName = "Sai Manasa";
        String yourName = "Sai Manasaaa";

        String myFirstName = myName.substring(0, 2);
        String yourFirstName = yourName.substring(0, 2);

        boolean weHaveSameFirstName = myFirstName.equals(yourFirstName);
        System.out.println(weHaveSameFirstName);

        String firstDay = "sunday";
        String lastDay;
        if(firstDay.equals("sunday"))
        {
            lastDay = "Saturday";
        }
        else {
            lastDay = "Sunday";
        }
        String nextDay = firstDay.equals("sunday") ? "monday" : "tuesday";

        //create a full name and get the space position
        //get the surname alone
        //create boolean even length, if last name length is even it is true, else false
        String fullName = "Sandra Burnside";
        int spacePosition = fullName.indexOf(" ");
        //System.out.println(spacePosition);

        String lastName = fullName.substring(spacePosition + 1 , fullName.length());

        boolean evenLength = lastName.length() %2 == 0 ? true : false;
        System.out.println(lastName);
        System.out.println(evenLength);

        System.out.println( fullName + " " + lastName + " " +  spacePosition + " " +  evenLength);

        String color = "blue, red, green, yellow";
        String[] colorsArray = color.split(", ");

        for(String colors : colorsArray){
            System.out.println(colors);
        }


    }
}

