package Backend.src.Exceptions;

public class StringToInteger {

    public static int convertToInteger(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String str : inputs) {
            try {
                int convertedValue = convertToInteger(str);
                System.out.println("Converted value of '" + str + "': " + convertedValue);
            } catch (NumberFormatException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}