package N_arrays;

public class Arrays4Plus {
    public static void main(String[] args) {
        String[] cars;
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] nums = {10, 20, 30, 40};
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;

        System.out.println("cars2[0]: " + cars2[0]);
        System.out.println("nums[1]: " + nums[1]);
        cars2[0] = "Midas Alonso";
        System.out.println("cars2[0]: " + cars2[0]);
        System.out.println("longitud de nums: " + nums.length);
        System.out.println("myNumbers es: " + myNumbers[1][2]);
    }
}
