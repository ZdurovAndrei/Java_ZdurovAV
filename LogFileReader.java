import java.io.*;

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
public class LogFileReader {
    public static void main(String[] args) throws IOException {
        try {
            String fileName = args[0];
            int numberOfLines = Integer.parseInt(args[1]);
            int amountOfRows = Integer.parseInt(args[2]);
            LogFileReader.readFile(fileName, numberOfLines, amountOfRows);
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
    }
    public static void readFile(String fileName, int numberOfLines, int amountOfRows) throws  IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try {
            String line;
            int i = 0;
            while (((line = reader.readLine()) != null) && i <= numberOfLines + amountOfRows ) {
                i++;
                if (i >= numberOfLines && i < numberOfLines + amountOfRows) {
                    System.out.println( line );
                }
            }
        }
        catch (IOException e) {
            System.out.println("Input ERROR");
        }
        finally {
            reader.close();
        }
    }
}