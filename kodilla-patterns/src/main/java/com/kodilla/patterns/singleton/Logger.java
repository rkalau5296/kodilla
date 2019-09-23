package com.kodilla.patterns.singleton;

public final class Logger {
    private static Logger logger = null;

    public static Logger getInstance(){
        if (logger == null) {
            synchronized (Logger.class) {
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    private String lastLog = "";

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
