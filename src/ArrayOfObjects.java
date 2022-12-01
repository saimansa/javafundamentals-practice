public class ArrayOfObjects {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        Book[] books = new Book[10];

        books[4] = new Book("A good read", "kona", 12.45);
        Book myBook; // this variable has a null value as there is no instance of a class at this point
        myBook = new Book("A good read part2", "kona", 21.45);  //after instantiation, my book has a value
//        myBook = null;

        if (myBook != null) {
            System.out.println(myBook.getTitle());

        }

        books[5] = myBook;
        books[8] = new Book("jingle bell", "manasa", 24.56);
        books[7] = new Book("rich man", "veer", 10.98);
        for (int i = 0; i < 10; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getTitle());
            }
        }
        for(Book book : books) {
            if (book != null) {
                System.out.println(book.getTitle());
            }

        }

    }


}
