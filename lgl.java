import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.swing.*;

public class Lgl {
    public static void main(String[] args) {
        try {
            // LGLファイルを取得
            List<String> lglSourceCodeRows = Files.readAllLines(Path.of("sample.lgl"));
            String lglSourceCode = "";
            for (String row : lglSourceCodeRows) {
                lglSourceCode += row;
            }

            System.out.println(lglSourceCode);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}