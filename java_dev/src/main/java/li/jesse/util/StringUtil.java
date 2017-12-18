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

        if (isOdd) {
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

    public static String commentBox(String title, Character borderElement, int maxEachSideCount) {
        int titleLength = title.length();
        if (titleLength == 0 || title == null  || borderElement == null) {
            return "invalid string";
        }

        int length = 0;
        int oddEven = titleLength & 1;
        Boolean isOdd;
        if (oddEven == 1) {
            isOdd = true;
            length = titleLength + 1;
        } else {
            isOdd = false;
            length = titleLength + 2;
        }
        if (maxEachSideCount - 1 <= length / 2) {

            return "invalid maxOneSideCount";
        }

        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(space);
        stringBuilder.append(title);
        stringBuilder.append(space);

        if (isOdd) {
            stringBuilder.append(space);
        }

        String appendedTitle = stringBuilder.toString();

        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < maxEachSideCount - 1 - appendedTitle.length() / 2; i++) {
            stringBuilder2.append(space);
        }
        String separator = stringBuilder2.toString();

        StringBuilder stringBuilder01 = new StringBuilder();
        for (int i = 0; i < maxEachSideCount * 2; i++) {
            stringBuilder01.append(borderElement);
        }
        String string01 = stringBuilder01.toString();

        StringBuilder stringBuilder02 = new StringBuilder();
        stringBuilder02.append(borderElement);
        for (int i = 0; i < maxEachSideCount * 2 - 2; i++) {
            stringBuilder02.append(space);
        }
        stringBuilder02.append(borderElement);
        String string02 = stringBuilder02.toString();

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(string01 + "\n");
        stringBuilder3.append(string02 + "\n");
        stringBuilder3.append(borderElement);
        stringBuilder3.append(separator);
        stringBuilder3.append(appendedTitle);
        stringBuilder3.append(separator);
        stringBuilder3.append(borderElement);
        stringBuilder3.append("\n");
        stringBuilder3.append(string02 + "\n");
        stringBuilder3.append(string01 + "\n");

        return stringBuilder3.toString();
    }
}
