import java.util.Arrays;
import java.util.Scanner;

public class LAB5binraySearchPROj {
    public static String binarySearch(String[][] info, String target) {
        int low = 0;
        int high = info.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target.compareTo(info[mid][0]);

            if (comparison == 0) {
                return info[mid][1];
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String[][] info = {
            {"22CS02", "ZAMEER"},
            {"22CS04", "SHAHID"},
            {"22CS06", "FARHAN"},
            {"22CS08", "ALI"},
            {"22CS10", "HAMZA"},
            {"22CS12", "SHAHZIL"},
            {"22CS14", "QASIM"},
            {"22CS16", "KAREEM"},
            {"22CS18", "HAMID"},
            {"22CS20", "PAKISTAN"},
            {"22CS22", "JAMSHEER"},
            {"22CS24", "ASHFAQUE"},
            {"22CS26", "SHAHEEN"},
            {"22CS28", "AHMED"},
            {"22CS30", "ARBAB"},
        };

        Scanner scanner = new Scanner(System.in);

        String[] rollNumbers = new String[info.length];
        for (int i = 0; i < info.length; i++) {
            rollNumbers[i] = info[i][0];
        }

        System.out.println("Sorted Roll Numbers: " + Arrays.toString(rollNumbers));
        System.out.println("Enter the contact to search for: ");
        String targetInfo = scanner.nextLine();
        String foundInfo = binarySearch(info, targetInfo);

        if (foundInfo != null) {
            System.out.println("Name: " + foundInfo);
        } else {
            System.out.println("Contact '" + targetInfo + "' not found in the list.");
        }
    }
}
