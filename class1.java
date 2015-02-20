import java.io.*;
import java.util.Scanner;

/**
 * Created by Здуров Андрей on 19.02.2015.
 *
 *  Прочитать содержание текстового файла построчно и вывести его на экран. В качестве текстового файла необходимо
 *  использовать один из access log-файлов расположенных по ссылке данной в начале практического блока.
 *
 *  Программа должна получать два параметра:
 *  1. Начиная с какой строки выводить строки на экран
 *  2. Количество выводимых строк.
 *
 *  Данные параметры должны передаваться как параметры командной строки, также как и имя текстового файла
 *  из которого надо читать эти строки.
 *
 */
public class class1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            String str;

            System.out.println("Input file name: ");
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            System.out.println("Input  number of lines to read: ");
            int numderOfLines = in.nextInt();
            System.out.println("Input amount of rows: ");
            int amountOfRows = in.nextInt();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int i = 0;
            while (((line = reader.readLine()) != null) && i <= numderOfLines + amountOfRows ) {
                i++;
                if (i >= numderOfLines && i < numderOfLines + amountOfRows) {
                    System.out.println( line );
                }
            }

            in.close();
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
    }
}