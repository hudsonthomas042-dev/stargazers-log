import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class test {
    public static void main(String[] args) throws IOException {
        Scanner michael = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = michael.nextLine();
        Scanner justin = new Scanner(new File(fileName));
        while(justin.hasNextLine()){
            System.out.println(justin.nextLine());
        }

    }
}
