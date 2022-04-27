package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SixCorrecIncorrect extends TestBase{
    @BeforeEach
    public void initialization(){
        start();
    }
    @AfterEach
    public void teardown(){
        finish();
    }

    @Test
    public void SimpleTestCorrect(){
        main    .goTo()
                .chooseTask("6");
        taskSix .checkPageIsCorrect()
                .fillInLogin("tester")
                .fillInPassword("123-xyz")
                .clickLoginButton()
                .checkIfLoginSuccess();
    }

    @Test
    public void SimpleTestIncorrect(){
        main    .goTo()
                .chooseTask("6");
        taskSix .checkPageIsCorrect()
                .fillInLogin("tester1")
                .fillInPassword("123-xyz1")
                .clickLoginButton()
                .checkIfLoginSuccess();
    }
}
