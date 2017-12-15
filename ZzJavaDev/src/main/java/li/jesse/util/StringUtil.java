package li.jesse.util;

public class StringUtil {


    public static String commentSeparator(String title, Character separatorElement, int maxEachSideCount) {
        int titleLength = title.length();
        if (titleLength == 0 || title == null  || separatorElement == null) {
            return "invalid string";
        }

        int length = 0;
        int oddEven = titleLength & 1;
        Boolean isOdd;
        if (oddEven == 1) {
            isOdd = true;
            length = titleLength + 3;
        } else {
            isOdd = false;
            length = titleLength + 2;
        }
        if (maxEachSideCount <= length / 2) {

            return "invalid maxOneSideCount";
        }

        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(space);
        stringBuilder.append(title);
        stringBuilder.append(space);
        int oddOrEven = titleLength & 1;
        if (oddOrEven == 1) {
            stringBuilder.append(separatorElement);
        }

        String appendedTitle = stringBuilder.toString();

        StringBuilder stringBuilder2 = new StringBuilder();

        StringBuilder stringBuilder3 = new StringBuilder();
        for (int i = 0; i < maxEachSideCount - appendedTitle.length() / 2; i++) {
            stringBuilder3.append(separatorElement);
        }
        String separator = stringBuilder3.toString();
        stringBuilder2.append(separator);
        stringBuilder2.append(appendedTitle);
        stringBuilder2.append(separator);

        return stringBuilder2.toString();
    }
}
