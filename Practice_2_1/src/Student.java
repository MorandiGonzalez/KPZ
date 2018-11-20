import java.util.HashSet;
import java.util.Scanner;

public class Student {

    private String last_name;
    private String name;
    private String middleName;
    private int studentID;
    private int course;
    private String counrty;
    private String sex;
    private double mark;

    public Student(){

    }

    public Student (String last_name, String name, String middleName, int studentID, int course, String counrty, String sex, double mark){
        this.last_name = last_name;
        this.name = name;
        this.middleName = middleName;
        this.studentID = studentID;
        this.course = course;
        this.counrty = counrty;
        this.sex = sex;
        this.mark = mark;
    }

    public HashSet<String> countrySet(){
        HashSet<String> countrySet = new HashSet<String>();
        countrySet.add("Ukraine");
        countrySet.add("Germany");
        countrySet.add("Italy");
        countrySet.add("Russia");
        countrySet.add("Spain");
        countrySet.add("Denmark");
        countrySet.add("Sweden");
        countrySet.add("Poland");
        countrySet.add("France");

        return countrySet;
    }

    public void arrayFill()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.println("-----------------------------------");
            System.out.println("Enter new student!");
            System.out.println("-----------------------------------");

            String last_name = new String();
            boolean f = true;
            while(f){
                System.out.println("Enter Last Name: ");
                last_name = scanner.nextLine();
                    if(!last_name.matches("^\\D*$")){
                        try {
                            throw new StudentExeption("Last name must not contain numbers!");
                        } catch (StudentExeption studentExeption) {
                         studentExeption.printStackTrace();
                        }
                    }
                    else
                        f = false;
            }

            String name = new String();
            f = true;
            while(f){
                System.out.println("Enter Name: ");
                name = scanner.nextLine();
                if(!name.matches("^\\D*$")){
                    try {
                        throw new StudentExeption("Name must not contain numbers!");
                    } catch (StudentExeption studentExeption) {
                        studentExeption.printStackTrace();
                    }
                }
                else
                    f = false;
            }


            String middleName = new String();
            f = true;
            while(f){
                System.out.println("Enter Middle Name: ");
                middleName = scanner.nextLine();
                if(!middleName.matches("^\\D*$")){
                    try {
                        throw new StudentExeption("Middle Name must not contain numbers!");
                    } catch (StudentExeption studentExeption) {
                        studentExeption.printStackTrace();
                    }
                }
                else
                    f = false;
            }

          /*  f = true;
            while(f){
                System.out.println("Enter StudentID: ");
                int studentID = Integer.parseInt(scanner.nextLine());
                if(studentID < 10 || studentID >999999){
                    try {
                        throw new StudentExeption("StudentID must not contain characters!");
                    } catch (StudentExeption studentExeption) {
                        studentExeption.printStackTrace();
                    }
                }
                else
                    f = false;
            }*/

            int studentID = 0;
            f = true;
            while(f){
                System.out.println("Enter StudentID: ");
                try {
                    studentID = Integer.parseInt(scanner.nextLine());
                    f = false;
                    if(studentID < 10 || studentID >999999){
                        try {
                            throw new StudentExeption("StudentID must be between 10 and 999999!");
                        } catch (StudentExeption studentExeption) {
                            studentExeption.printStackTrace();
                            f = true;
                        }
                    }
                    else
                        f = false;
                }catch (NumberFormatException e){
                    System.err.println("StudentID must not contain characters!");
                    f = true;
                }

            }

            int course = 0;
            f = true;
            while(f){
                System.out.println("Enter course: ");
                try {
                    course = Integer.parseInt(scanner.nextLine());
                    f = false;
                    if(course < 1 || course > 5){
                        try {
                            throw new StudentExeption("Course must be between 1 and 5!");
                        } catch (StudentExeption studentExeption) {
                            studentExeption.printStackTrace();
                            f = true;
                        }
                    }
                    else
                        f = false;
                }catch (NumberFormatException e){
                    System.err.println("Course must not contain characters!");
                    f = true;
                }

            }

            String country = new String();
            f = true;
            while(f){
                System.out.println("Enter country: ");
                country = scanner.nextLine();
                if(!countrySet().contains(country)){
                    try {
                        throw new StudentExeption("There is no such country!");
                    } catch (StudentExeption studentExeption) {
                        studentExeption.printStackTrace();
                    }
                }
                else
                    f = false;
            }


            String sex = new String();
            f = true;
            while(f){
                System.out.println("Enter sex: ");
                sex = scanner.nextLine();
                if(!sex.equals("Male") && !sex.equals("Female")){
                    try {
                        throw new StudentExeption("Gender must be Male or Female!");
                    } catch (StudentExeption studentExeption) {
                        studentExeption.printStackTrace();
                    }
                }
                else
                    f = false;
            }


            double mark = 0;
            f = true;
            while(f){
                System.out.println("Enter mark: ");
                try {
                    mark = (Double.parseDouble(scanner.nextLine()));
                    f = false;
                    if(mark < 1 || mark > 5){
                        try {
                            throw new StudentExeption("Mark must be between 1 and 5!");
                        } catch (StudentExeption studentExeption) {
                            studentExeption.printStackTrace();
                            f = true;
                        }
                    }
                    else
                        f = false;
                }catch (NumberFormatException e){
                    System.err.println("Mark must not contain characters!");
                    f = true;
                }

            }


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
    }




    public String getLast_name(){
        return  last_name;
    }

    public String getName(){
        return name;
    }

    public String getMiddleName(){
        return middleName;
    }

    public int getStudentID(){
        return studentID;
    }

    public int getCourse(){
        return  course;
    }

    public String getCounrty(){
        return counrty;
    }

    public String getSex(){
        return sex;
    }

    public double getMark(){
        return  mark;
    }


    protected void setLast_name(String last_name){
        this.last_name = last_name;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    protected void setStudentID(int studentID){
        this.studentID = studentID;
    }

    protected void setCourse(int course){
        this.course = course;
    }

    protected void setCounrty(String counrty){
        this.counrty = counrty;
    }

    protected void setSex(String sex){
        this.sex = sex;
    }

    protected void setMark(double mark){
        this.mark = mark;
    }

    @Override
    public  String toString(){
       return "Last Name: " + last_name +
               ", Name: " + name +
               ", Middle Name: " + middleName +
               ", Student ID: " +  studentID +
               ", Course: " + course +
               ", Country: " + counrty +
               ", Sex: " + sex +
               ", Mark: " + mark;
    }

}
