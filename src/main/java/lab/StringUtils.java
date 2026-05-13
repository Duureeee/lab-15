package lab;

public class StringUtils {

    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}
