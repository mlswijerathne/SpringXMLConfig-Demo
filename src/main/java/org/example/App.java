package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
        laptop obj1 = (laptop)context1.getBean("laptop");
        obj1.acer();
    }
}
