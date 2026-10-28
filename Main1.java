import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student 1: ");

        String name = scan.nextLine().trim();
        Student s1 = new Student(name);
        s1.addScore(57);
        s1.addScore(35);
        s1.addScore(91);
        s1.addScore(57);
        s1.addScore(69);
        double average = s1.getAverage();
        System.out.println(name + ": " + average);

        System.out.print("Enter Student 2: ");
        String nam = scan.nextLine();
        Student s2 = new Student(nam);

        s2.addScore(35);
        s2.addScore(57);
        s2.addScore(39);
        s2.addScore(68);
        double s2Av = s2.getAverage();
        System.out.println(nam + ": " + s2Av);

        System.out.print("Enter Student 2: ");
        String nam1 = scan.nextLine();
        Student s3 = new Student(nam1);
        double s3Av = s3.getAverage();
        System.out.println(nam1 + ": " + s3Av);
        
        System.out.print("Enter Student 2: ");
        String nam2 = scan.nextLine();
        Student s4 = new Student(nam1);
        s4.addScore(-89);
        double s4Av = s4.getAverage();
        System.out.println(nam2 + ": " + s4Av);
        
        System.out.print("Enter Student 2: ");
        String nam3 = scan.nextLine();
        Student s5 = new Student(nam1);
        s5.addScore(101);
        double s5Av = s5.getAverage();
        System.out.println(nam3 + ": " + s5Av);
        scan.close();
    }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
    }
    }
}
