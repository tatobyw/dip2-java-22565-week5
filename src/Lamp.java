public class Lamp {
    // stores the value for light
    // true if light is on
    // flase if light is off
    boolean isOn;

    //method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on? \n" + isOn);
    }
}
