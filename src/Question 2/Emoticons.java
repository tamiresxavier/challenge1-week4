import java.util.Scanner;

public class Emoticons {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the message:");
        String message = input.nextLine();

        int amused = 0;
        int annoyed = 0;
        for(int i = 0; i < message.length()-1; i++){
            if(message.charAt(i) == ':' && message.charAt(i+1) == '-'){
                if(i+2 < message.length() && message.charAt(i+2) == ')'){
                    amused++;
                }else if(i+2 < message.length() && message.charAt(i+2) == '('){
                    annoyed++;
                }
            }
        }

        if(amused > annoyed){
            System.out.println("fun");
        }else if(amused == annoyed){
            System.out.println("neutral");
        }else{
            System.out.println("upset");
        }
        
    }
}