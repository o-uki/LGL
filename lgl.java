import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class LglToken {
    String token;
    String code;

    public LglToken(String setToken, String setCode) {
        this.token = setToken;
        this.code = setCode;
    }
}

public class Lgl {
    public static void main(String[] args) {
        try {
            // LGLファイルを取得
            List<String> lglSourceCodeRows = Files.readAllLines(Path.of("sample.lgl"));
            String lglSourceCode = "";
            for (String row : lglSourceCodeRows) {
                lglSourceCode += row;
            }

            // LGLのトークンの配列
            LglToken[] lglTokens = new LglToken[4];
            lglTokens[0] = new LglToken(":", "set");
            lglTokens[1] = new LglToken("{", "nestBracketLeft");
            lglTokens[2] = new LglToken("}", "nestBracketRight");
            lglTokens[3] = new LglToken(".", "end");

            // 一文字ずつ解析
            for (int i = 0; i < lglSourceCode.length(); i++) {
                for (Object token : lglTokens) {
                    
                }
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}