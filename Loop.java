class Loop {
    static boolean isPass(int score) {
        return score >= 60;
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 62, 91, 48};
        int count = 0;
        for (int i=0; i < scores.length; i++) {
            if (isPass(scores[i])) {
                count++;
                System.out.println(scores[i]);
            }
        }
        System.out.println(count + " passed");
    }
}