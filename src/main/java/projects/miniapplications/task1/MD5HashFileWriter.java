package projects.miniapplications.task1;

import java.io.FileWriter;
import java.io.IOException;

public class MD5HashFileWriter {

        public static void saveMD5HashToFile(String md5Hash) throws IOException {
            try (FileWriter writer = new FileWriter("md5hash.txt")) {
                writer.write(md5Hash);
            }
        }
    }

