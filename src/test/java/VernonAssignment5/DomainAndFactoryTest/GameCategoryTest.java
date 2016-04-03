package VernonAssignment5.DomainAndFactoryTest;

import VernonAssignment5.Domain.GameCategory;
import VernonAssignment5.Factory.GameCategoryFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GameCategoryTest {

    private GameCategoryFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = GameCategoryFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        GameCategory gt = factory.GameGategoryFactory("Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getCategory(),"Action");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameCategory gt = factory.GameGategoryFactory("Games of Wars");

        // Updated Description follows

        GameCategory updateGameTitles = new GameCategory.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
