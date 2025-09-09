package tddbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    ClosedRange closedRange;

    @BeforeEach
    void beforeEach(){
        closedRange = new ClosedRange(1, 2);
    }

    @Test
    void lowerPointを取得できる(){
        // given
        Integer actual = closedRange.getLowerPoint();
        Integer expected = 1;
        // when
        // then
        assertEquals(expected, actual);
    }

    @Test
    void upperPointを取得できる(){
        // given
        Integer actual = closedRange.getUpperPoint();
        Integer expected = 2;
        // when
        // then
        assertEquals(expected, actual);
    }

    @Test
    void 想定するフォーマットに整形できる(){
        // given
        String expected = "[1,2]";
        Integer input1 = 1;
        Integer input2 = 2;
        // when
        String actual = closedRange.makeFormatedString(input1, input2);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void 大小関係が整っている(){
        // given
        Boolean expected = true;
        Boolean actual = closedRange.getLowerPoint() <= closedRange.getUpperPoint();
        // when
        // then
        assertEquals(expected, actual);
    }

}
