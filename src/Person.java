import java.util.Scanner;


public class Person{
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Namel;

    public Person(){}
    public Person(String name){p_Namel = name;}

    public void driveTransport(Transport a){
        a.drivingMethod();  
    }
    public void show(Transport a)
    {
        a.show();
    }




    public static void main(String[] args) throws Exception {
        Person person = new Person("xiaoming");
        Aircraft aircraft = new Aircraft("1");
        Airship airship = new Airship("2");
        Automobile automobile = new Automobile("3");
        Bicycle bicycle = new Bicycle("4");
        HotAirBalloon hotAirBalloon = new HotAirBalloon("5");
        Hovercraft hovercraft = new Hovercraft("6");
        Motorcycle motorcycle = new Motorcycle("7");
        Ship ship = new Ship("8");
        Submarine submarine = new Submarine("9");
        person.show(aircraft);
        person.driveTransport(aircraft);
        person.show(airship);
        person.driveTransport(airship);
        person.show(automobile);
        person.driveTransport(automobile);
        person.show(bicycle);
        person.driveTransport(bicycle);
        person.show(hotAirBalloon);
        person.driveTransport(hotAirBalloon);
        person.show(hovercraft);
        person.driveTransport(hovercraft);
        person.show(motorcycle);
        person.driveTransport(motorcycle);
        person.show(ship);
        person.driveTransport(ship);
        person.show(submarine);
        person.driveTransport(submarine);
        
    }
}
