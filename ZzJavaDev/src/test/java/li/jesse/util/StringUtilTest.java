package li.jesse.util;

import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testCommentSeparator() {
        String aa = StringUtil.commentSeparator("!", "*", 13);
        System.out.println(aa);
    }
}
