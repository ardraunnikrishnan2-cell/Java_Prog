public class Main {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50, 60 };

        int target = 30;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;

                System.out.println("Target element found:" + arr[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("Target element not found");
        }
    }
}