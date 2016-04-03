package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.GameTitles;
import VernonAssignment5.Factory.GameTitlesFactory;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GamesTitlesTest {

    private GameTitlesFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = GameTitlesFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        GameTitles gt = factory.GameTitlesFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getMachine(),"PlayStation2");
    }


   @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
       GameTitles gt = factory.GameTitlesFactory("Games of Wars");

        // Updated Description follows

        GameTitles updateGameTitles = new GameTitles.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
