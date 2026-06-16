package FH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FileRed {
    public static void main(String[] args)throws IOException {
        System.out.println("Starting my file");
        String path = "C:\\Users\\kondr\\IdeaProjects\\day1\\src\\FH\\tast.text";
        File f = new File(path);
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
      // char r=(char)br.read();
        //System.out.println(r);
        int ch;
        int c=0;
        while((ch=br.read())!=-1){
            System.out.println((char)ch);
            c++;
        }
        System.out.println(c);
    }
}
