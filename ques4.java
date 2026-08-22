import java.util.Scanner;
public class ques4{
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int  secA_sum=0, secB_sum=0, highest=0, highest_index=0;
        char highestSec='a';
        for(int i = 0 ;i<sectionA.length;i++){
            secA_sum+=sectionA[i];
            secB_sum+=sectionB[i];
            if(sectionA[i]>highest){
                highest=sectionA[i];
                highest_index = i;
                highestSec = 'A';
            }
            if(sectionB[i]>highest){
                highest=sectionB[i];
                highest_index = i;
                highestSec = 'B';
            }
        }
        //Displaying Data Here After :-
        System.out.print("Section A Total: " + secA_sum + " | ");
        System.out.print("Section B Total: " + secB_sum + " | ");
        if(secB_sum>secA_sum){
            System.out.print("Status: Section B Overloaded | ");
        }
        else if(secA_sum>secB_sum){
            System.out.print("Status : Section A Overloded | ");
        }
        else{
            System.out.print("Status: Balanced | ");
        }
        System.out.print("Highest Quantity: " + highest + " (Section " + highestSec + ", Item " + (highest_index+1) + ")");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int no_of_categories;
        System.out.print("Enter number of product Categories in Section: ");
        no_of_categories = scan.nextInt();
        scan.nextLine();
        int[] sectionA = new int[no_of_categories];
        int[] sectionB = new int[no_of_categories];
        System.out.println("----- Enter number of products in each categories accordingly -----");
        System.out.println("\nEnter for Section A :");
        for(int i = 0; i<no_of_categories;i++){
            System.out.print("Enter number of products for category " + (i+1) + " : ");
            sectionA[i] = scan.nextInt();
        }
        System.out.println("\nEnter for Section B: ");
        for( int j = 0; j<no_of_categories;j++){
            System.out.print("Enter number of products for category " + (j+1) + " : ");
            sectionB[j] = scan.nextInt();
        }
        analyzeInventory(sectionA, sectionB);
        scan.close();
    }
}