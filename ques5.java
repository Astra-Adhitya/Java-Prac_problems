import java.util.Scanner;
public class ques5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a;
        int s=0,m=0,l=0;
        System.out.print("Enter String: ");
        a=scan.nextLine();
        String[] b=a.split(" ");
        for(String i : b){
            if(i.length()<5){
                s++;
            }
            else if(i.length()<9){
                m++;
            }
            else{
                l++;
            }
        }
        System.out.println("Short: " + s + " | Medium: " + m + " | Long: " + l);
        scan.close();
    }
}