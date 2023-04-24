package bytestreams2;

import java.io.BufferedOutputStream;
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
public class lab4 {

    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream buff = new BufferedOutputStream(file);
            buff.write("Hello World!".getBytes());
            buff.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab4.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
