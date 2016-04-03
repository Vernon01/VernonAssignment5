package VernonAssignment5.Factory;

import VernonAssignment5.Domain.TopGamesOfTheYear;

/**
 * Created by VERNON on 2016/04/03.
 */
public class TopGamesOfTheYearFactory {

    private static TopGamesOfTheYearFactory factory;

    private TopGamesOfTheYearFactory() {
    }
    public static TopGamesOfTheYearFactory getInstance(){
        if(factory == null)
            factory = new TopGamesOfTheYearFactory();
        return factory;
    }

    public static TopGamesOfTheYear TopGamesOfTheYearFactory(String title)
    {
        TopGamesOfTheYear gc = new TopGamesOfTheYear
                .Builder("Games of Wars")
                .year("2013")
                .build();
        return gc;
    }
}
