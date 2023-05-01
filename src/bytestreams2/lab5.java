package bytestreams2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab5 {

    public static void main(String[] args) throws ClassNotFoundException {
        Student s = new Student("123", "Jack Daniel");
        try {
            FileOutputStream file = new FileOutputStream("obj.dat");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(s);
        } catch (IOException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("obj.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student ss = (Student)input.readObject();
            System.out.println(ss);
        } catch (IOException ex) {
            Logger.getLogger(lab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
