package ru.sbt.bit.ood.hw1;

public class TradesJob {

    private final Downloader downloader;
    private final Parser parser;
    private final Updater updater;

    public TradesJob(Downloader downloader, Parser parser, Updater updater) {
        this.downloader = downloader;
        this.parser = parser;
        this.updater = updater;
    }

    public void run() {
        String filename = downloader.downloadFile();
        Iterable<Trade> trades = parser.parse(filename);
    //    updater.updateTrades(trades);
    }

}
