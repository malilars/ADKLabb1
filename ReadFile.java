import java.io.*;

/**
 * Created by malinlarsson on 2016-09-09.
 */
public class ReadFile
{
    public ReadFile() {
        String path = "sökväg";

        BufferedInputStream bis = Mio.OpenRead(path);



        while(!Mio.EOF(bis)) {

            String combination = Mio.GetWord(bis);
            String rowInKorpus = Mio.GetWord(bis);

        }


        //Denna filen kommer att skrivas till. A-filen
        RandomAccessFile raf = new RandomAccessFile(new File("res/tmp/ut"));
    }
}
