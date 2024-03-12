package DesignPatterns.Factory;

public class Flutter {
    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public void setTheme(){
        System.out.println("Setting theme");
    }
    public UIFactory createUIfactory(String platform){
        return UIFactoryByPlatform.getUIFactoryByPlatform(platform);
    }
}
