import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNumbers(nums);
        printEvenNumbers(nums);

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        printUniqueStrings(strings);
        printStringsDoubles(strings);
    }

    public static void printOddNumbers(List<Integer> list) {
        for (Integer num : list) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void printEvenNumbers(List<Integer> list) {
        HashSet<Integer> nums = new HashSet<>();
        for (Integer num : list) {
            if (num % 2 == 0 && !nums.contains(num)) {
                nums.add(num);
                System.out.println(num);
            }
        }
    }

    public static void printUniqueStrings(List<String> list) {
        HashSet<String> set = new HashSet<>();
        for (String str : list) {
            if (!set.contains(str)) {
                System.out.println(str);
                set.add(str);
            }
        }
    }

    public static void printStringsDoubles(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }

        for (Integer integer : map.values()) {
            System.out.println(integer);
        }
    }


}