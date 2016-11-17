package ru.sbt.bit.ood.hw1;

/**
 * Created by balkh on 16.11.2016.
 */
public class Updater {
    private final TradesDAO tradesDAO;

    public Updater(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        for (Trade trade : trades) {
            tradesDAO.save(trade);
        }
    }
}
