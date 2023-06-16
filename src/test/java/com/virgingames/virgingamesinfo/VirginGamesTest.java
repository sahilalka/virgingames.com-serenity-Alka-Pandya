package com.virgingames.virgingamesinfo;

import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static org.hamcrest.Matchers.hasValue;

@RunWith(SerenityRunner.class)
public class VirginGamesTest extends TestBase {
    static int id;
    static String name;
    static double amount;
    static String currency;
    @Steps
    VirginGamesSteps virginGamesSteps;

    @Title("This method will get all jackpot information")
    @Test
    public void test001(){
        virginGamesSteps.getAllJackpotstInfo().statusCode(200).log().all();
    }
    @Title("This method will verify if currency is equal to GBP")
    @Test
    public void test002(){
        ValidatableResponse response = virginGamesSteps.getAllJackpotstInfo();
        HashMap<String,Object> gamesMap = response.extract().path("data.pots[0]");
        System.out.println("List" + gamesMap);
        Assert.assertThat(gamesMap,hasValue("GBP"));
    }

}
