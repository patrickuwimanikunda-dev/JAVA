import java.util.Scanner;
import java.util.ArrayList;

public class Scan {
    public static boolean isPass(int score) {
        return score >= 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        System.out.println("TYPE THE SCORE THEN ENTER AND TYPE DONE WHEN YOU ARE DONE\n---------------------------------------------------------------------");
        while (true) {
            System.out.println("Enter the score: ");
            String inPut = scanner.nextLine().trim();
            if (inPut.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                int score = Integer.parseInt(inPut);
                scores.add(score);

            } catch (NumberFormatException e) {
                System.out.println("Please provide only whole numbers or type 'done' to finish.");
            }
        }
        System.out.println("========== Collected scores ==============");
        double sum = 0;
        if(sum==0){
                System.out.println("No scores were provided");
                System.exit(0);
            }
        System.out.println(scores.size() + " scores were provided");
        int count = 0;
        
        //for here if sum was integer it would be dividing only the integers which provides the whole number part of the result and ignores the decimal places and I avoided this by making sum a double so that the division contains a double which is prefered more than the integer
        for (int i : scores) {
            if (isPass(i)) {
                // System.out.println(i);
                count++;
            }
        }
        for (int s : scores) {
            sum += s;
        }
        System.out.println(count + " passed");
        System.out.println("Average: " + sum / scores.size());
        scanner.close();
    }

}
