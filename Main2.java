public class Main2 
{
    public static void main(String[] args) 
    {

        int[] arr = {4, 5, 21, 30};
        int target = 26;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) 
        {

            for (int j = i + 1; j < arr.length; j++) 
            {

                if (arr[i] + arr[j] == target) 
                {
                    System.out.println("Target found using: "
                            + arr[i] + " + " + arr[j] + " = " + target);

                    found = true;
                }
            }
        }

        if (!found) 
        {
            System.out.println("No two elements add up to the target.");
        }
    }
}  

