
class Employee{
    void display_detais(String Name, int employeeId, double basicSalary, int yearsOfService){
        double HRA = 0.25 * basicSalary;
        double DA = 0.15 * basicSalary;
        double TA = 0.10 * basicSalary;
        double PF = 0.12 * basicSalary;
        double grossSalary = basicSalary + HRA + DA + TA;
        double netSalary = grossSalary - PF;
        double annualSalary = netSalary * 12;
        double tax;
        double TakeHome;
        if (annualSalary>500000){
            tax = 0.1 * annualSalary;
            TakeHome = annualSalary - tax;
        }
        else{
             tax = 0;
             TakeHome = annualSalary;
        }
        System.out.println("Employee name: "+Name+
        "\nEmployee_id: "+employeeId+
        "\nyears of Service: "+yearsOfService+
        "\nBasic Salary: "+basicSalary+
        "\nHRA (25%): "+HRA+
        "\nDA (15%): "+DA+
        "\nTA (10%): "+TA+
        "\nGross Salary: "+grossSalary+
        "\nPF (12%): "+ PF+
        "\nNet Salary: "+ netSalary+
        "\nAnuual Package: "+annualSalary+
        "\nTax: "+ tax+
        "\nTake Home: "+TakeHome
 );



    }
}
public class Assignment_2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display_detais("Mr.Joshi", 1101, 8000.00, 5);


    }
}
