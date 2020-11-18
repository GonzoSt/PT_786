public class SmartPhone extends Phone{

    public void receiveCall (String callerName) {
        System.out.println("SmartPhone. Звонит " + callerName);
    }

    public void getNumber (String callerNumber) {
        System.out.println("SmartPhone " + callerNumber);
    }

    public void sendMessages (String... numbers) {
        for (String number : numbers) {
            System.out.println("SmartPhone " + number);
        }
    }
}
