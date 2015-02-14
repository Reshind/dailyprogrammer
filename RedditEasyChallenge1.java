import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RedditEasyChallenge1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String redditName;
        
        // Prompt users to enter data.
        System.out.print("What's your name? ");
        name = keyboard.next();
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        System.out.print("What's your reddit username? ");
        redditName = keyboard.next();
        
        // Print information to user.
        System.out.println("Your name is " + name + ". Your age is " + age + ".");
        System.out.println("Your reddit username is " + redditName + ".");
        
        // Print results to file.
        try {
            FileWriter myFile = new FileWriter("user-information.txt", true);
            myFile.write("Your name is: " + name + ".\r\n");
            myFile.write("You are " + age + " years old.\r\n");
            myFile.write("Your reddit username is: " + redditName + ".\r\n");
            myFile.write("------------------\r\n\r\n");
            myFile.close();
        } catch (IOException ex) {
            Logger.getLogger(RedditEasyChallenge1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
