// Write a program to demonstrate ArrayIndexOutOfBoundsException
//Hint =>
//Define a variable of array of names and take input from the user
//Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program.
//Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

public class ArrayIndexOutOfBoundsExample {
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Invalid index
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Anshuman", "Raj", "Ravi"};

        // generateException(names); // Uncomment to crash
        handleException(names);
    }
}

