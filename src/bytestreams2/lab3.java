package bytestreams2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab3 {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream out = new DataOutputStream(file);
            out.writeUTF("Jim Henry");
            out.writeInt(30);
            out.writeDouble(65.5);
            out.writeChar('A');
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());            
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
