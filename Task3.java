import java.util.Scanner;

public class Task3 {

// student Grade calculator
    public static void main(String[] args) {
        System.out.println("Enter the name of the student");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the marks of mathematics out of 100");
        float subject1 = sc.nextFloat();
        System.out.println("Enter marks of physics out of 100");
             float subject2 = sc.nextFloat();

        System.out.println("Enter marks of Chemistry out of 100");
        float subject3= sc.nextFloat();

        System.out.println("Enter marks of English out of 100");
        float subject4 = sc.nextFloat();

        System.out.println("Enter marks of Hindi out of 100");
        float subject5 = sc.nextFloat();

        // total marks
        float total_marks =  subject1 + subject2 + subject3 + subject4 + subject5;

        // percentage
        float percentage = (total_marks)/5;

        System.out.println(name + " has got total of " + total_marks + " marks and percentage of " + percentage );
        
        if (32 > percentage ) {
            System.out.println(" Grade = F");
        }

        if (32 < percentage && percentage < 45) {
            System.out.println("Grade = c");
        }

        if( 45 < percentage && percentage < 70 ){
            System.out.println("Grade = B");
        }

        if(70 < percentage && percentage < 90){
            System.out.println(" Grade = A");
        }

        if (90 < percentage && percentage < 100) {
            System.out.println("Grade = A++");
        }

    }
}
