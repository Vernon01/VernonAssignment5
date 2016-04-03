package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GameTitles;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GameTitlesFactory {

    private static GameTitlesFactory factory;

    private  GameTitlesFactory() {
    }
    public static GameTitlesFactory getInstance(){
        if(factory == null)
            factory = new GameTitlesFactory();
        return factory;
    }

    public static GameTitles GameTitlesFactory(String title)
    {
        GameTitles gt = new GameTitles
                .Builder("Games of Wars")
                .year("2013")
                .machine("PlayStation2")
                .build();
        return gt;
    }
}
