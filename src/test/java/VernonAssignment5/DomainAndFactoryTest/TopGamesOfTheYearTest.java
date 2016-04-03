package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.TopGamesOfTheYear;
import VernonAssignment5.Factory.TopGamesOfTheYearFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class TopGamesOfTheYearTest {

    private TopGamesOfTheYearFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = TopGamesOfTheYearFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        TopGamesOfTheYear gt = factory.TopGamesOfTheYearFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        TopGamesOfTheYear gt = factory.TopGamesOfTheYearFactory("Games of Wars");

        // Updated Description follows

        TopGamesOfTheYear updateGameTitles = new TopGamesOfTheYear.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
