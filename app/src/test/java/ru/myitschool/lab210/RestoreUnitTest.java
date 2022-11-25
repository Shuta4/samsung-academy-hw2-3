package ru.myitschool.lab210;

import org.junit.Assume;
import org.junit.Test;

public class RestoreUnitTest {

    @Test
    public void failingAssert() {
        assert false;
    }

    @Test
    public void failingAssumption() {
        Assume.assumeTrue(false);
    }

    @Test
    public void fakeTest1() { }

    @Test
    public void fakeTest2() { }

    @Test
    public void fakeTest3() { }

    @Test
    public void fakeTest4() { }

}
