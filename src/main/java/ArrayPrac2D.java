public class ArrayPrac2D {
    public static void main(String[] args) {

        // 2D array = An array where each elements is an array
        //              useful for storing a matrix of data



        // 2D array
        String[][] groceries = {{"Apple", "Banana", "Orange", "Banana"},
                {"Carrot", "Potato", "Tomato", "Onion"},
                {"Chicken", "Beef", "Pork", "Fish"}};

        groceries[2][0] = "cherry";

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
