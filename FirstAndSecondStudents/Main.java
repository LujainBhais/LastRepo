import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of students : ");
        int studentsNumber = input.nextInt();

        //للتأكد من أن عدد الطلاب أكبر من 2
        if (studentsNumber<2){
            System.out.print("At least 2 students are required ");
            return;
        }
        String topStudent="",secondTopStudent="";
        double topScore=Double.MIN_VALUE,secondTopScore=Double.MIN_VALUE;

        //إدخال أسماء الطلاب وعلاماتهم :
        for(int i=1;i<=studentsNumber;i++){
            System.out.print("Enter "+i+" Student :");
            String name=input.next();
            System.out.print("Enter student's Score : ");
            double score =input.nextDouble();
            //تحديث القيم بناء على الدرجات :
            if (score > topScore) {
                secondTopScore = topScore;
                secondTopStudent = topStudent;
                topScore = score;
                topStudent = name;
            } else if (score > secondTopScore) {
                secondTopScore = score;
                secondTopStudent = name;
            }
        }
        System.out.print("\nTop student : "+topStudent+" with score : "+topScore);
        System.out.print("\nsecond top student : "+secondTopStudent+" with score : "+secondTopScore);
        System.out.println("Done !");

    }
}