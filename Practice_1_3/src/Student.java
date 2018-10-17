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
