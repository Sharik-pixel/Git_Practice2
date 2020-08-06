package day_07_operators_casting_boolean_if;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int myNumber = 100;
        System.out.println("MyNumber: " + myNumber);

        myNumber++;
        System.out.println("MyNumber: " + myNumber);

        ++myNumber;
        System.out.println("MyNumber: " + myNumber);

        myNumber++; myNumber++; myNumber++;
        System.out.println("MyNumber: " + myNumber);

        ++myNumber;
        myNumber++;
        ++myNumber;
        System.out.println("MyNumber: " + myNumber);

        // -------
        int booksToRead = 5;
        System.out.println("BooksToRead:" + booksToRead);
        booksToRead--;//4
        System.out.println("BooksToRead:" + booksToRead);

        --booksToRead;//3
        --booksToRead;//2
        System.out.println("BooksToRead:" + booksToRead);//2

        --booksToRead;
        booksToRead--;
        System.out.println("BooksToRead:" + booksToRead);//0

        booksToRead--;
        System.out.println("BooksToRead:" + booksToRead);

        char letter = 'A';//65 - A
        System.out.println("Letter: " + letter);

        letter ++;//66 -B
        System.out.println("Letter: " + letter);

        ++letter;//67 - C

        ++letter;//68 - D
        System.out.println("Letter: " + letter);

        char myChar = '!';
        System.out.println("MyChar: " + myChar);
        myChar++; //"
        System.out.println("MyChar: " + myChar);
        myChar+=10; //,
        System.out.println("MyChar: " + myChar);
    }
}
