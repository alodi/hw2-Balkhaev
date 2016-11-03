package ru.sbt.bit.ood.hw1;

public class TradesJob {

    private final TradesDAO tradesDAO;
    private final TradeDownloader tradeDownloader;
    private final TradeParser tradeParser;
    public TradesJob(TradesDAO tradesDAO, TradeDownloader tradeDownloader, TradeParser tradeParser) {
        this.tradesDAO = tradesDAO;
        this.tradeDownloader = tradeDownloader;
        this.tradeParser = tradeParser;
    }

    public void run() {
        String filename = tradeDownloader.downloadFile();
        Iterable<Trade> trades = tradeParser.parse(filename);
        updateTrades(trades);
    }

    private void updateTrades(Iterable<Trade> trades) {
        tradesDAO.deleteAll();
        for (Trade trade : trades) {
            tradesDAO.save(trade);
        }
    }
}
