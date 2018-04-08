package Files;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        // This is make a new file if we make this program once more, content of previous file will be overwrite
        File file = new File("src/Files/plik.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try {
            bufferedWriter.write("This is an example writing to file");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Found exception: IOException");
        }

        // This block adding text to file
        FileWriter fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write("\nThis is new text");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Found exception: IOException");
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println(line);
        } catch (IOException ex) {
            System.out.println("Found IOException");
        }

        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        System.out.println(s);
    }
}
