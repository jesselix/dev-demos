package li.jesse.javadevmocking.mock;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;


public class HelloTest {

    @Test
    public void testVerify() throws Exception {

        List mockedList = mock(List.class);
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("two");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList, times(2)).add("two");
        verify(mockedList).clear();
    }

}
