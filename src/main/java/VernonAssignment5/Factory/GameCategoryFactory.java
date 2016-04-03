package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GameCategory;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GameCategoryFactory {

    private static GameCategoryFactory factory;

    private GameCategoryFactory() {
    }
    public static GameCategoryFactory getInstance(){
        if(factory == null)
            factory = new GameCategoryFactory();
        return factory;
    }

    public static GameCategory GameGategoryFactory(String title)
    {
        GameCategory gc = new GameCategory
                .Builder("Games of Wars")
                .year("2013")
                .category("Action")
                .build();
        return gc;
    }
}
