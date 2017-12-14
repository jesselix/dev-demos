package li.jesse.util;

public class StringUtil {


    public static String commentSeparator(String title, String separatorElement, int maxEachSideCount) {
        int titleLength = title.length();
        if (titleLength == 0 || title == null || separatorElement.length() == 0 || separatorElement == null) {
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
        System.out.println(maxEachSideCount);
        System.out.println(length);
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
            stringBuilder.append(space);
        }

        String appendedTitle = stringBuilder.toString();

        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < maxEachSideCount - appendedTitle.length() / 2; i++) {
            stringBuilder2.append(separatorElement);
        }
        stringBuilder2.append(appendedTitle);
        for (int i = 0; i < maxEachSideCount - appendedTitle.length() / 2; i++) {
            stringBuilder2.append(separatorElement);
        }
        return stringBuilder2.toString();
    }
}
