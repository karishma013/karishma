package Backend.src.Exceptions;

public class main {

    public static void main(String[] args) {

        try {

            int[] array = new int[1];
            array[2] = 10;

        } catch (RuntimeException e) {


            myException myException = new myException(e.getMessage());


            System.out.println("A custom exception has been caught: " + myException.getMessage());
        }
    }
}
