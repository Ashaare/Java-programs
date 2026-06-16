package FH;
import java.io.*;
import java.util.Scanner;
public class FH {
    public static void main(String[] args)throws IOException{
        System.out.println("Starting my file");
        String path="C:\\Users\\kondr\\IdeaProjects\\day1\\src\\FH\\tast.text";
       File f=new File(path);
       FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        //fw.write("hello world");

       // bw.write("HELLO am ASHA ARE");
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        bw.newLine();
        bw.write(inp);

        bw.close();
        fw.close();

    }
}
