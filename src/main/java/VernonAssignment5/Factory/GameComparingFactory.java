package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GameComparing;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GameComparingFactory {

    private static GameComparingFactory factory;

    private  GameComparingFactory() {
    }
    public static GameComparingFactory getInstance(){
        if(factory == null)
            factory = new GameComparingFactory();
        return factory;
    }

    public static GameComparing GameComparingFactory(String title)
    {
        GameComparing gt = new GameComparing
                .Builder("Games of Wars")
                .year("2013")
                .comment("Awesome war game")
                .build();
        return gt;
    }
}
