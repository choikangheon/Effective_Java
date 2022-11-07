package org.example.chapter01.item01;

public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;
    private Settings(){}

    private static final Settings SETTINGS = new Settings();

    public static final Settings newINSTANCE(){
        return  SETTINGS;
    }

    public static void main(String[] args) {
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());
    }
}
