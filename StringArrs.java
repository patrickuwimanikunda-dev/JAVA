import java.util.ArrayList;

public class StringArrs {
    static boolean hasName(ArrayList<String> names, String target) {
        for (String name : names) {
            if (name.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void findName(ArrayList<String> names, String name) {
        if (hasName(names, name)) {
            System.out.println(name + " found in the list");
        } else {
            System.out.println(name + " not found in the list");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Patrick");
        names.add("Sun");
        names.add("Heaven");
        names.add("Peter");
        names.add("Home");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
        int count = 0;
        for (String name : names) {
            if (name.length() > 4) {
                count++;
            }
        }
        System.out.println(count + " names have characters greater than 4");
        findName(names, "Heaven");
        findName(names, "Julian");
    }
}
