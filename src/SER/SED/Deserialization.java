package SER.SED;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {


        String path = "C:\\Users\\kondr\\IdeaProjects\\day1\\src\\SER\\SED\\ser.txt";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        SER s = (SER) ois.readObject();
        s.display();
        ois.close();
        fis.close();

    }
}