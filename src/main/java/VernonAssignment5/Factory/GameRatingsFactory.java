package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GameRatings;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GameRatingsFactory {

    private static GameRatingsFactory factory;

    private  GameRatingsFactory() {
    }
    public static GameRatingsFactory getInstance(){
        if(factory == null)
            factory = new GameRatingsFactory();
        return factory;
    }

    public static GameRatings GameRatingsFactory(String title)
    {
        GameRatings gt = new GameRatings
                .Builder("Games of Wars")
                .year("2013")
                .price("480")
                .rating(8)
                .build();
        return gt;
    }
}
