import java.util.Scanner;
import java.lang.String;

public class Main{
    public static void main(String ... args){

        System.out.println("Skovorodin Mykhailo\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("-----------------------------------");
            System.out.println("Enter new student!");
            System.out.println("-----------------------------------");

            System.out.println("Enter Last Name: ");
            String last_name = scanner.nextLine();

            System.out.println("Enter Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter Middle Name: ");
            String middleName = scanner.nextLine();

            System.out.println("Enter StudentID: ");
            int studentID = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter course: ");
            int course = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter country: ");
            String country = scanner.nextLine();

            System.out.println("Enter sex: ");
            String sex = scanner.nextLine();

            System.out.println("Enter mark: ");
            double mark = (Double.parseDouble(scanner.nextLine()));


            students[i] = new Student(last_name, name, middleName, studentID, course, country, sex, mark);
            
        }

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }


        //What is the criteria for sampling?
        System.out.println("\n\nWhat is the criteria for sampling?");
        System.out.println("1. Get a list of students excellent 2nd year.");
        System.out.println("2. Get a list of foreign students studying only for good and excellent.");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        switch (choice){
            case 1:
                System.out.println("Search results\n");
                for (int i = 0; i < students.length; i++) {
                    if(students[i].getCourse() == 2 && students[i].getMark() == 5){
                        System.out.println(students[i].toString());
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("The search yielded no results.");
                }
                break;
            case 2:
                System.out.println("Search results\n");
                for (int i = 0; i < students.length; i++){
                    if (!students[i].getCounrty().equals("Ukraine") && (students[i].getMark() == 4 || students[i].getMark() == 5)){
                        System.out.println(students[i].toString());
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("The search yielded no results.");
                }
                break;

        }
       // System.out.println(students.toString());
    }
}
