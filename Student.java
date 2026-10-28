import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> scores;

    private double sum = 0;

    public void addScore(int score) {
        if (score >= 0 && score <= 100) {
            this.scores.add(score);
        } else {
            throw new IllegalArgumentException("Scores should be from 0 to 100");
        }
    }
    public double getAverage() {
        if (scores.isEmpty()) {
            return 0.0;
        }
        for (int s : scores) {
            sum += s;
        }
        return sum / scores.size();
    }

    Student(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
}

