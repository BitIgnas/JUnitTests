package example3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class BoxProcessorTest {

    private static BoxProcessor processor;

    @BeforeAll
    public static void setup() {
        processor = new BoxProcessor();
    }

    @Test
    void shouldProcessBox() {
        Box box = new Box();
        processor.processBox(box);
        assertThat("Label_BOX", is(box.getName()));
        assertThat(20.0, is(box.getPrice()));
        assertThat(12, is(box.getWeight()));
    }
}