package InterviewQuesPlaylist;

//find duplicate value in array

//1. create nested loop to get pointer and check all values in arr
//2. HashSet - if attemp to add duplicate item to set, will return false - HashSet<String> arr = new HashSet<>(); arr.add(str1);

public class DupInArr {
    public static void dupInArr (String[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; i++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Duplicate not found");
        }
        else {
            System.out.println("Duplicate found");
        }

    }
}
