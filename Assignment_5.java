import java.util.Scanner;

public class Assignment_5{
    static Scanner sc = new Scanner (System.in);
    static String name = null;
    static String course = null;
    static Boolean hasScholarship = null;
    static Boolean isLate = null;
    static double fee = 0;
    static double[] marks = new double[3];
    static double avg = 0;
    static String grd = null;
    static int counter = 0001;
    public static void main(String[] args){
        int choose;
        int loop = 0;
        while(loop != 7){ 
            System.out.println("\nSelect:\n1.Enrollment\n2.Fees\n3.Enter Marks\n4.Average\n5.Grade\n6.Report card\n7.Exit");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    enrollStudent();
                    break;
                case 2:
                    System.out.print("Scholarship?(true/false):");
                    hasScholarship = sc.nextBoolean();
                    System.out.print("Late Fee?(true/false):");
                    isLate = sc.nextBoolean();
                    if(hasScholarship == false && isLate == false){
                        calculateFee(course);
                    }
                    else if(hasScholarship == true && isLate == false){
                        calculateFee(course, hasScholarship);
                    }
                    else if (hasScholarship == true && isLate == true){
                        calculateFee(course,hasScholarship, isLate);
                    }
                    break;
                case 3:
                    enterMarks();
                    break;
                case 4:
                    average(marks);
                    break;
                case 5:
                    grade(avg);
                    break;
                case 6:
                    printReport(name,course, fee, avg, grd);
                    break;
                case 7:
                    loop = 7;
                default:
                    System.err.println("Bye");
                    break;
            }
            g
        }
    }
static void enrollStudent(){
    System.out.println("Enter your name:");
    name = sc.next();
    System.out.println("Enter your course");
    course = sc.next();
    System.out.println(name+" in "+course+" (Roll: "+course+"_"+counter+")");
    counter++;
    }
    
static void calculateFee(String c){
    if(c.equals("Java")){
        fee = 15000.0;
    }
    else if (c.equals("Python")){
        fee = 12000.0;
    }
    else if (c.equals("Data Science")){
        fee = 20000.0;
    }
    else{
        System.out.println("Invalid course");
    }
    System.out.print("Fee: Rs."+fee);
}

static void calculateFee(String c, Boolean hS){
    if(c.equals("Java") && hS){
        fee = 15000.0 - 0.2*15000;
    }
    else if (c.equals("Python") && hS){
        fee = 12000.0 - 0.2*12000;
    }
    else if (c.equals("Data Science") && hS){
        fee = 20000.0 - 0.2*20000;
    }
    else{
        System.out.println("Invalid course");
    }
    System.out.print("Fee: Rs."+fee);
}

static void calculateFee(String c, Boolean hS, Boolean iL){
    if(c.equals("Java") && hS && iL){
        fee = 15000.0 - 0.2*15000 + 500;
    }
    else if (c.equals("Python" )&& hS && iL){
        fee = 12000.0 - 0.2*12000 +500;
    }
    else if (c.equals("Data Science") && hS && iL){
        fee = 20000.0 - 0.2*20000 + 500;
    }
    else{
        System.out.println("Invalid course");
    }
    System.out.print("Fee: Rs."+fee);
 }

static void enterMarks(){
    for (int i = 0; i < 3;i++){
        System.err.println("Enter marks for subject"+i+1+":");
        marks[i] = sc.nextInt();
    }
    System.out.println("Marks Submitted Successfully!");
}


static void average(double[] marks){
    double sum = 0;
    for (int i = 0;i<3;i++){
        sum += marks[i];
    }
    avg = sum/3.0;
    System.out.println("Average: "+avg);
}

static void grade(double average){
    if (average > 90 && average <= 100){
        grd = "A";
    }
    else if (average > 80 && average <= 90 ){
        grd = "B";
    } 
    else if (average > 70 && average <= 80){
       grd = "C";
    }
    else if (average > 60 && average <= 70){
       grd = "D";
    }
    else if (average > 50 && average <= 60){
       grd = "E";
    }
    else if (average > 40 && average <= 50){
       grd = "F";
    }
    System.out.println("Grade: "+grd);
    
}

static void printReport( String name, String course, double fee, double average, String grade){
    System.out.println("Report of "+name+
    "\nCourse: "+course+
    "\nFee paid: "+fee+
    "\nAverage: "+average+
    "\nGrade: "+grade
    );
    

}
}