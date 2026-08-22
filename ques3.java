import java.util.Scanner;
public class ques3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String signalLog;
        int longestStreak=0, currentStreak=0;
        int longestStreakWordindex=0;
        System.out.print("Enter Signal Log: ");
        signalLog = scan.nextLine();
        for(int i = 1 ; i<signalLog.length();i++){
            if(signalLog.charAt(i)==signalLog.charAt(i-1)){
                currentStreak++;
                if(currentStreak>longestStreak){
                    longestStreak=currentStreak;
                    longestStreakWordindex=i;
                }
            }
            else{
                currentStreak=0;
            }
        }
        System.out.println("Longest Streak: '" + signalLog.charAt(longestStreakWordindex) + "' repeated " + (longestStreak+1) + " times");
        scan.close();
    }
}