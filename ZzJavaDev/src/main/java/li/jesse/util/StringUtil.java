package li.jesse.util;

public class StringUtil {


    public static String commentSeparator(String title, String separatorElement, int maxEachSideCount) {
        int titleLengh = title.length();
        if (titleLengh == 0 || title == null || separatorElement.length() == 0 || separatorElement == null) {
            return "invalid string";
        }

        if (maxEachSideCount < titleLengh / 2 + 1) {
            return "invalid maxOneSideCount";
        }

        return null;
    }
}
