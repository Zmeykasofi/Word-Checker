import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> set;

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
        set = new HashSet<>(List.of(this.text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String input) {
        return this.set.contains(input);
    }
}
