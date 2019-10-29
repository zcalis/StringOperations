import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void longest1() {
        Assert.assertEquals(StringModifier.longestWord(""), "Input cannot be empty");

    }

    @Test
    public void longest2() {
        Assert.assertEquals(StringModifier.longestWord("aaaaa"), "aaaaa and its length is 5 character(s)");

    }

    @Test
    public void longest3() {
        Assert.assertEquals(StringModifier.longestWord("a bb ccc dddd eeee fffff gggggg "), "gggggg and its length is 6 character(s)");

    }

    @Test
    public void longest4() {
        Assert.assertEquals(StringModifier.longestWord("a bb ccc dddd eeee ffffffffff gggggg "), "ffffffffff and its length is 10 character(s)");

    }

    @Test
    public void longest5() {
        Assert.assertEquals(StringModifier.longestWord("aaaaaaaaaa bbbbbbbbb cccccccc ddddddd eeeeee fffff gggg hhhh iii jj k "), "aaaaaaaaaa and its length is 10 character(s)");

    }

    @Test
    public void shortest1() {
        Assert.assertEquals(StringModifier.shortestWord(""), "Input cannot be empty");

    }

    @Test
    public void shortest2() {
        Assert.assertEquals(StringModifier.shortestWord("aaaaa"), "aaaaa and its length is 5 character(s)");

    }

    @Test
    public void shortest3() {
        Assert.assertEquals(StringModifier.shortestWord("a bb ccc dddd eeee fffff gggggg "), "a and its length is 1 character(s)");

    }

    @Test
    public void shortest4() {
        Assert.assertEquals(StringModifier.shortestWord("aaaaa bb ccc dddd eeee f gggggg "), "f and its length is 1 character(s)");

    }

    @Test
    public void shortest5() {
        Assert.assertEquals(StringModifier.shortestWord("aaaaaaaaaa bbbbbbbbb cccccccc ddddddd eeeeee fffff gggg hhhh iii jj k "), "k and its length is 1 character(s)");

    }

    @Test
    public void shortest6() {
        Assert.assertEquals(StringModifier.shortestWord("aaa bb ccc dddd eeee  "), "bb and its length is 2 character(s)");

    }

}
