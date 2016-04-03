package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.GamePerformanceToPrice;
import VernonAssignment5.Factory.GamePerformanceFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GamePerformanceToPriceTest {

    private GamePerformanceFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = GamePerformanceFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        GamePerformanceToPrice gt = factory.GamePerformanceFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getOpinion(),"pay the price for a good game");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GamePerformanceToPrice gt = factory.GamePerformanceFactory("Games of Wars");

        // Updated Description follows

        GamePerformanceToPrice updateGameTitles = new GamePerformanceToPrice.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
