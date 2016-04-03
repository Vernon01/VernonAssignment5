package VernonAssignment5.Factory;

import VernonAssignment5.Domain.UnderRatedGames;

/**
 * Created by VERNON on 2016/04/03.
 */
public class UnderRatedGamesFactory {

    private static UnderRatedGamesFactory factory;

    private  UnderRatedGamesFactory() {
    }
    public static UnderRatedGamesFactory getInstance(){
        if(factory == null)
            factory = new UnderRatedGamesFactory();
        return factory;
    }

    public static UnderRatedGames UnderRatedGamesFactory(String title)
    {
        UnderRatedGames gt = new UnderRatedGames
                .Builder("Games of Wars")
                .year("2013")
                .reason("excellent experience")
                .build();
        return gt;
    }
}
