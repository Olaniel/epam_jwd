package hw.task.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public String readToString(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bReader = new BufferedReader(
                new FileReader(file))) {

            String line = bReader.readLine();
            while (line != null) {
                if ("".equals(line)) {

                    line = bReader.readLine();
                    continue;
                }
                sb.append(line);
                line = bReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Input file reading error");
//            e.printStackTrace();
        }
        return sb.toString();
    }

    public List<String> readToList(File file) {

        List<String> list = new ArrayList<>();

        try (BufferedReader bReader = new BufferedReader(
                new FileReader(file))) {

            String line = bReader.readLine();
            while (line != null) {
                if ("".equals(line)) {

                    line = bReader.readLine();
                    continue;
                }
                list.add(line);
                line = bReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Input file reading error");
        }
        return list;
    }

}
