package com.graham.ciaTool;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class Config implements ServletContextListener {

   // @Override
    public void contextInitialized(ServletContextEvent event) {
        System.setProperty("org.apache.el.parser.COERCE_TO_ZERO", "false");
    }

   // @Override
    public void contextDestroyed(ServletContextEvent event) {
        // NOOP
    }

} 


