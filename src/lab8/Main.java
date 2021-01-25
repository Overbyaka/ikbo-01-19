package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try(FileWriter wr = new FileWriter("C:\\Users\\evg\\Desktop\\GrishkovaEvgenyaAndreevna\\GitHub\\ikbo-01-19\\test.txt", true)){
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            wr.write(line);
            wr.flush();

            FileReader rd = new FileReader("C:\\Users\\evg\\Desktop\\GrishkovaEvgenyaAndreevna\\GitHub\\ikbo-01-19\\test.txt");
            int c;
            while((c=rd.read())!=-1) System.out.print((char)c);
        }
        catch(IOException e){
            System.out.println("ErRoR!");
            System.exit(0);
        }
    }
}
