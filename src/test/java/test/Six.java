package test;

import org.junit.jupiter.api.Test;

public class Six extends TestBase{
    @Test
    public void testSix(){
        main    .goTo()
                .chooseTask("6");
        taskSix .checkPageIsCorrect()
                .fillInLogin("tester")
                .fillInPassword("123-xyz")
                .clickLoginButton()
                .checkPageIsCorrect();
    }
}
