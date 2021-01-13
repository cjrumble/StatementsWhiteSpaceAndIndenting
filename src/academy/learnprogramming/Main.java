package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50;
	    if (myVariable == 50) {
            System.out.println("Printed " + myVariable);
        }

	    myVariable++;
	    myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +
                "another test " +
                "and still more tests.");

        // many statements can be on same line
        int anotherVariable = 5; myVariable--; System.out.println("Test");

    }
}
