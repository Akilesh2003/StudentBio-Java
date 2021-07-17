import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private StudentBio bio;

    public UserInterface(){
        this.scanner = new Scanner(System.in);
        this.bio = new StudentBio();
    }

    public void start(){
        while(true){
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            this.bio.addName();

            System.out.println("Enter student class:");
            int cl = scanner.nextLine();
            this.bio.addClass(cl);

        }
    }
}
