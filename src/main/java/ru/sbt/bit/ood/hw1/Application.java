package ru.sbt.bit.ood.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by balkh on 16.11.2016.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        context.getBean("tradesJob");
    }
}
