import java.util.Scanner;
public class ques2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String original_word, user_typed_word;
        System.out.print("Enter the original right word: ");
        original_word = scan.nextLine();
        System.out.print("Now Type the word at your convinience: ");
        user_typed_word = scan.nextLine();
        int total_words = original_word.length();
        int mistakes=0;
        int mismatch_pos=-1;
        for( int i =0;i<original_word.length();i++){
            if(!(original_word.charAt(i)==user_typed_word.charAt(i))){
                mistakes++;
                if(mismatch_pos==-1){
                    mismatch_pos=i;
                }
            }
        }
        System.out.print("Matched: " + (total_words-mistakes) + "/" + total_words + " | ");
        System.out.print("Average: " + (((double)(total_words-mistakes)/total_words)*100) + "% | ");
        if(mismatch_pos==-1){
            System.out.println("No Mismatches");
        }
        else{
            System.out.print(
                "First Mismatch at position " + (mismatch_pos+1) + " ('" + 
                original_word.charAt(mismatch_pos) +"' vs '" + 
                user_typed_word.charAt(mismatch_pos) + "')");
        }
        scan.close();
    }
}