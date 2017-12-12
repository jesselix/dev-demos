package li.jesse.util;

public class StringUtil {


    public static String commentSeparator(String title, String separatorElement, int maxOneSideCount) {
        int titleLenght = title.length();
        if (titleLenght == 0 || title == null || separatorElement.length() == 0 || separatorElement == null) {
            return "invalid string";
        }
        if (maxOneSideCount < 1) {
            return "invalid maxOneSideCount";
        }

        return null;
    }
}
