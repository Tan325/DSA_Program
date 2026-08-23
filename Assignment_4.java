import java.util.Scanner;

class Booking{
    Scanner sc = new Scanner(System.in);
     
    int hall = 0;
    int row = 0;
    int column = 0;
    int booked = 0;

    String[][][] seats = new String[3][5][8];
    Booking(){
        for (int k =0; k<3; k++){
            for (int i=0; i<5; i++){
                for (int j=0; j<8; j++){
                    seats[k][i][j] = "Available";
            }
        }
    }
}

    void view(){
        for (int k =0;k<3;k++){
            for (int i = 0; i < 5; i++){
                for (int j = 0; j< 8; j++){
                        System.out.println((k+1)+" - "+(char)('A'+i) + (j+1) + " - " +seats[k][i][j]);
                    }
            }
        }
     }


    void book(){

        System.out.println("Choose a Hall(1,2,3):");
        hall = sc.nextInt();
        System.out.println("Choose row(1,2,3,4,5):");
        row = sc.nextInt();
        System.out.println("Choose column(1,2,3,4,5,6,7,8):");
        column = sc.nextInt();

        if (seats[hall-1][row-1][column-1].equals("Booked")){
            System.out.println("Seat is already booked");
        }
        else{
            seats[hall-1][row-1][column-1] = "Booked";
            System.out.println("Seat Booked Successfully");
        }
     }

    void cancel(){
        System.out.println("Choose a Hall(1,2,3):");
        hall = sc.nextInt();
        System.out.println("Choose row(1,2,3,4,5):");
        row = sc.nextInt();
        System.out.println("Choose column(1,2,3,4,5,6,7,8):");
        column = sc.nextInt();

        if (seats[hall-1][row-1][column-1].equals("Booked")){
            seats[hall-1][row-1][column-1] = "Available";
            System.out.println("Booking cancelled successfully.");
        }
        else{
            System.out.println("Seat was never booked.");
        }
    }

    void HallSummary(){
        System.out.println("Hall selected: "+hall);
        System.out.println("Total number of seats: 40 ");
            for (int i=0; i<5; i++){
                for (int j=0; j<8; j++){
                    if(seats[hall][i][j].equals("Booked")){
                        booked += 1;
     
                }
            }
                
            }
        System.out.println("Total number of seats booked: "+booked);
        System.out.println("Number of seats available: "+(40-booked));

    }

    void Exit(){
         HallSummary();
        System.out.println("Total revenue: "+(booked*250));
        System.out.println("Thank You!");

    }

}

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Booking b = new Booking();
        int option = 0;
        while(true){
           System.out.println("Choose option:\n1.View available seat\n2.Book Tickets\n3.Cancel Booking\n4.Hall Summary \n5.Exit");
           option = sc.nextInt();
           switch(option){
                case 1:
                   b.view();
                   break;
                case 2:
                   b.book();
                   break;
                case 3:
                   b.cancel();
                   break;
                case 4:
                   b.HallSummary();
                   break;
                case 5:
                   b.Exit();
                   break;
                default:
                   System.err.println("Invalid");

    }
            if (option == 5){
                break;
            }
   }
}
}


