import java.io.*;

/**
 * Created by malinlarsson on 2016-09-09.
 */
public class ReadFile
{
    public ReadFile(String filePath)
    {
        String path = filePath;

        BufferedInputStream bis = Mio.OpenRead(path);


        //While we still have rows left in the file
        while(!Mio.EOF(bis)) {
            //Pick the word
            String word = Mio.GetWord(bis);
            //Pick the address
            String rowInKorpus = Mio.GetWord(bis);

            //Call hash function with the first word and store the address
            lazyMansHash(word, rowInKorpus);

        }

    /*
     * Make the hash index for the word
     * @param String the word that we want to make an index for
     * @return the hash index for the word
     */
    private int hashIndex(String word)
        {
            String wordToHash = word;
          return int hashCode;
            hashCode = wordToHash[0]*900 + wordToHash[1]*30 + wordToHash[2];

        }
    private void lazyMansHash(String word, String rowInKorpus)
    {
        String wordToHash = word;
        int hashIndex(wordToHash);
        int rowIndex = Integer.parseInt(rowInKorpus);

    }
        //This is the file we write to. The A-file
        RandomAccessFile raf = new RandomAccessFile(new File("res/tmp/aFile"));
    }



}
