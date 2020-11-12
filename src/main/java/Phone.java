public class Phone {

    public String number;
    public int weight;
    public String model;

    public static void receiveCall (String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public static void getNumber (String callerNumber) {
        System.out.println(callerNumber);
    }
}
