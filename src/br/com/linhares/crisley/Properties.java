package br.com.linhares.crisley;

public class Properties {

    public static boolean CLOSE_BROWSER = true;
    public static Browsers BROWSER = Browsers.CHROME;

    public static ExecutionType EXECUTION_TYPE = ExecutionType.LOCAL;

    public enum Browsers{
        CHROME,
        FIREFOX
    }

    public enum ExecutionType{
        LOCAL
    }
}
