import java.util.Scanner;
public class ques1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        boolean breakcondition=false;
        System.out.print("Enter number of seat numbers: ");
        n=scan.nextInt();
        int[] array_of_seats = new int[n];
        System.out.println("----- Enter seat numbers accordingly -----");
        for(int k = 0; k<n;k++){
            System.out.print("Enter Seat "+(k+1)+" Number: ");
            array_of_seats[k]=scan.nextInt();       
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(array_of_seats[i]==array_of_seats[j]){
                    System.out.println("Duplicate Seat Number Found: "+array_of_seats[i]);
                    breakcondition=true;
                    break;
                }
            }
            if(breakcondition){
                break;
            }
        }
        if(!breakcondition){
            System.out.println("No Duplicate Seats Found");
        }
        scan.close();
    }
}