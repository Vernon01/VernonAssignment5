package VernonAssignment5.Factory;

import VernonAssignment5.Domain.GamePerformanceToPrice;

/**
 * Created by VERNON on 2016/04/03.
 */
public class GamePerformanceFactory {

    private static GamePerformanceFactory factory;

    private  GamePerformanceFactory() {
    }
    public static GamePerformanceFactory getInstance(){
        if(factory == null)
            factory = new GamePerformanceFactory();
        return factory;
    }

    public static GamePerformanceToPrice GamePerformanceFactory(String title)
    {
        GamePerformanceToPrice gt = new GamePerformanceToPrice
                .Builder("Games of Wars")
                .year("2013")
                .opinion("pay the price for a good game")
                .build();
        return gt;
    }
}
