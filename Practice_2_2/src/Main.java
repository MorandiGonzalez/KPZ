import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main (String... args) throws IOException{
        String fileName = "D:\\Java_Projects\\Practice_2_2\\Test files\\test.txt";
        String fileOutput = "D:\\Java_Projects\\Practice_2_2\\Test files\\out.txt";

        File file = new File(fileOutput);
        //readUsingBufferedReader(fileName);
        List<String> stringList = readUsingBufferedReader(fileName);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput));
        for (String s: stringList) {
           if (s.substring(0,1).toUpperCase().equals("K") || s.substring(0,1).toUpperCase().equals("S")) {
               // writeUsingBufferWriter(fileOutput, s);
               bw.write(s);
               bw.write("\n");
           }

        }

        bw.close();
    }

    private static List<String> readUsingBufferedReader(String fileName) throws IOException {
        List<String> stringList = new ArrayList<>();
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, "Cp1251");
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line = br.readLine()) != null){
                System.out.println(line);
                stringList.add(line);

            //System.out.println(line);
        }
        br.close();
        return stringList;

    }

    /*public static void writeUsingBufferWriter(String fileName, String write) throws  IOException{
        //File file = new File(fileName);
        *//*FileOutputStream fou = new FileOutputStream(file);
        OutputStreamWriter osr = new OutputStreamWriter(fou, "Cp1251");*//*


    }*/
}

