package ru.sbt.bit.ood.hw1;

/**
 * Created by balkh on 03.11.2016.
 */
public interface Parser {
    Iterable<Trade> parse(String filename);
}
