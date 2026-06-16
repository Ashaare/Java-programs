package SER.SED;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args)throws IOException {
        SER s=new SER(1,"Asha");
        s.display();
        String path="C:\\Users\\kondr\\IdeaProjects\\day1\\src\\SER\\SED\\ser.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
}
