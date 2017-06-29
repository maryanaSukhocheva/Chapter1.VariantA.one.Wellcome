
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SLAVA
 */
public class Wellcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        String encoding = System.getProperty("console.encoding", "cp1251");
        
        Scanner scan = new Scanner(System.in, encoding);
           String name = "";
         
            if (scan.hasNext()) {
                name = scan.next();
                }
             System.out.println("Привет, " + name);
           

        }
}
