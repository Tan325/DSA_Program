import java.util.Scanner;

class Grading{
    double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }

    String grade(double avg){
        if (avg>=90){
                return "A";
            }
            else if (avg >= 80 && avg < 90){
                return "B";
            }
            else if (avg >=70 && avg <80){
                return "C";
            }

            else if (avg >= 60 && avg <70){
                 return "D";
            }
            else{
                return "F";
            }
    }

    String remark( String grd){
            switch (grd){
                case "A":
                    return "Excellent";
                case "B":
                    return "Good";
                case "C":
                    return "Avearge";
                case "D":
                    return "Below Avearge";
                case "F":
                    return "Fail";
                default:
                    return "Invalid";
            }
    }

    
    
}

public class Assignment_3 {
    public static void main(String[] args) {
        Grading gr = new Grading();
        Scanner sc = new Scanner (System.in);
        double average = 0;
        String grade = null;
        String remark = null;
        String status = null;

        int marks1, marks2, marks3;
        System.out.println("Enter marks for 3 subjects:");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        if (marks1<0 || marks1>100 || marks2<0 || marks2>100|| marks3<0 || marks3>100){
            System.out.println("Invalid marks.Enter Again");
        }
        else{
            average = gr.average(marks1, marks2, marks3);
            grade = gr.grade(average);
            remark = gr.remark(grade);
               
            if(marks1 >=40 && marks2 >=40 && marks3 >= 40 && average >=50){
                status = "Passed";
            }
            else{
                if (marks1 <40 && marks2 >=40 && marks3 >= 40){
                    marks1 += 5;
                    average = gr.average(marks1,marks2,marks3);
                    if (average >50){
                        status = "Passed";
                    }
                    else{
                        status ="Fail";
                    }
                }
                else if (marks1 >= 40 && marks2 < 40 && marks3 >= 40){
                    marks2 += 5;
                    average = gr.average(marks1,marks2,marks3);
                    if (average >50){
                        status = "Passed";
                    }
                    else{
                        status ="Fail";
                }

            }
                else if (marks1 >= 40 && marks2 >= 40 && marks3 < 40){
                    marks3 += 5;
                    average = gr.average(marks1,marks2,marks3);
                    if (average >50){
                        status = "Passed";
                    }
                    else{
                        status ="Fail";
                }
                }
                else{
                    status = "Fail";
                }
                




            }
        
        }
        System.out.println("Subject1 marks: "+marks1+
            "\nSubject2 marks: "+marks2+
            "\nSubject3 marks: "+marks3+
            "\nAverage: "+average+
            "\nGrade: "+grade+
            "\nRemark: "+remark+
            "\nStatus: "+status
        );

    }}
    



