public class es1 {
    public static void main(String[] args) {

        System.out.println("La somma dei numeri inseriti è: " + product(3, 5));
        System.out.println("concatenazione tra una stringa e un numero: " + concatString("HELLO ", 45));

        String[] myArray = {"as", "df", "gh", "jk", "lm"};

        myArray = arrayPusher(myArray, "ciao");

        for (String s : myArray) {
            System.out.println(s);
        }
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String concatString(String a, int b) {
        return a + (Integer.toString(b));
    }

    public static String[] arrayPusher(String[] myArray, String myString) {
        int arraySize = myArray.length + 1;
        int positionToAdd = 2;
        String[] stringContainer = {myString};
        String[] newArray = new String[arraySize];
        System.arraycopy(myArray, 0, newArray, 0, 2);
        System.arraycopy(stringContainer, 0, newArray, positionToAdd, 1);
        System.arraycopy(myArray, 2, newArray, 3, 3);
        return myArray = newArray;
    }
}
