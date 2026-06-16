package FH;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FHH {
    public static void main(String[] args)throws IOException {
        System.out.println("Starting my file");
        String path="C:\\Users\\kondr\\IdeaProjects\\day1\\src\\FH\\tast.text";
        File f1=new File(path);
        File f2=new File("C:\\Users\\kondr\\IdeaProjects\\day1\\src\\FH\\txt.text");
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fos2=new FileOutputStream(f2);
        int ch;
        while((ch=fis1.read())!=-1) {
            System.out.print((char) ch);
            fos2.write(ch);
        }
        fis1.close();
        fos2.close();

    }
}
