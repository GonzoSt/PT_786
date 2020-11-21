public class SmartPhone extends Phone{
    public static void receiveCall (String callerName) {
        System.out.println("SmartPhone. Звонит " + callerName);
    }

    public static void getNumber (String callerNumber) {
        System.out.println("SmartPhone " + callerNumber);
    }

    public static void sendMessages (String... numbers) {
        for (String number : numbers) {
            System.out.println("SmartPhone " + number);
        }
    }
}
