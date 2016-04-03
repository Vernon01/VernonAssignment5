package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GamePrices;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GamePricesFactory {

    private static GamePricesFactory factory;

    private  GamePricesFactory() {
    }
    public static GamePricesFactory getInstance(){
        if(factory == null)
            factory = new GamePricesFactory();
        return factory;
    }

    public static GamePrices GamePricesFactory(String title)
    {
        GamePrices gt = new GamePrices
                .Builder("Games of Wars")
                .year("2013")
                .price("480")
                .machine("xbox")
                .build();
        return gt;
    }
}
