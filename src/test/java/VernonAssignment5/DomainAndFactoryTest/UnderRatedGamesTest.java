package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.UnderRatedGames;
import VernonAssignment5.Factory.UnderRatedGamesFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class UnderRatedGamesTest {

    private UnderRatedGamesFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = UnderRatedGamesFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        UnderRatedGames gt = factory.UnderRatedGamesFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getReason(),"excellent experience");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        UnderRatedGames gt = factory.UnderRatedGamesFactory("Games of Wars");

        // Updated Description follows

        UnderRatedGames updateGameTitles = new UnderRatedGames.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
