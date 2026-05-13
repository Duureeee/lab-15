package lab;

public class StringUtils {

    public boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    public String reverse(String text) {
        if (text == null) {
            return null;
        }

        return new StringBuilder(text).reverse().toString();
    }
}
