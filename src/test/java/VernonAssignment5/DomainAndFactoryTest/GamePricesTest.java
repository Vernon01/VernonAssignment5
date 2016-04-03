package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.GamePrices;
import VernonAssignment5.Factory.GamePricesFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GamePricesTest {

    private GamePricesFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = GamePricesFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        GamePrices gt = factory.GamePricesFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getPrice(),"480");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GamePrices gt = factory.GamePricesFactory("Games of Wars");

        // Updated Description follows

        GamePrices updateGameTitles = new GamePrices.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
