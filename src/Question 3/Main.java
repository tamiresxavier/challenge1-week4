import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        String[] questions = {};
        String[] answers = {};

        int hits = 0;
        int mistakes = 0;
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            String answer = input.nextLine();
            
            if(answer.equalsIgnoreCase(answers[i])){
                System.out.println("Right answer!");
                hits++;
            }else{
                System.out.println("Incorrect answer!");
                mistakes++;
            }
        }
        
        System.out.println("User " + name + "\n" + "right: " + hits + "\n" + "wrong: " + mistakes);
    
    }
}