package quickstart;

import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Java\\hello_unicode.txt");
        InputStreamReader readf = new InputStreamReader(new FileInputStream(f));
        BufferedReader bfReader = new BufferedReader(readf);
        String txtline = null;
        while ((txtline = bfReader.readLine()) != null) {
            System.out.println(txtline);
        }
        bfReader.close();
    }
}
