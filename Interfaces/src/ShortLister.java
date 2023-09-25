import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getPath();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                Object[] words = reader.lines().toArray();

                Filter filter = new ShortWordFilter();
                List<Object> shortWords = FilterUtils.collectAll(words, filter);

                for (Object word : shortWords) {
                    System.out.println(word);
                }

                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

