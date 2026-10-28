import java.util.ArrayList;

public class ArrayLists {
    static boolean isPass(int score) {
        return score >= 60;
    }

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(89);
        scores.add(67);
        scores.add(34);
        scores.add(56);
        scores.add(98);

        try {
            for (int i = 0; i < scores.size(); i++) {
                if (isPass(scores.get(i))) {
                    System.out.println(scores.get(i));
                }
            }
            System.out.println(scores.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        scores.add(48);
        scores.add(83);
        System.out.println(scores.size());
    }
}