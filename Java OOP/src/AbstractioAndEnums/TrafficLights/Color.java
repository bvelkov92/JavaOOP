package AbstractioAndEnums.TrafficLights;


public enum Color {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    String nextLight;

    Color(String nextLight){
        this.nextLight=nextLight;
    }

    public String getNextLight() {
        return nextLight;
    }

    public void setNextLight(String nextLight) {
        this.nextLight = nextLight;
    }
}
