import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class L050_readFileCountWords {

    public static void main(String[] args) throws IOException {

        String content;
        content = new String(Files.readAllBytes(Paths.get("textfile.txt")));
        //System.out.println(content+"\n");

        String content1 = content.replaceAll("[\n]", " ");
        System.out.println(content1+"\n");

        String content2 = content1.replaceAll("[.,!?;:]", "");
        //System.out.println(content2+"\n");

        int blockCount = content2.split(" ").length;
        System.out.print("Total words: "+blockCount+"\n");

        String[] arrStr = content2.toLowerCase().trim().split(" ");

        Map<String, Integer> mapStr = new HashMap<>();

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(""))
                continue;
            if (mapStr.containsKey(arrStr[i]))
                mapStr.put(arrStr[i], mapStr.get(arrStr[i]) + 1);
            else mapStr.put(arrStr[i], 1);
        }

        System.out.println("Words counter: "+mapStr);

    }

}
