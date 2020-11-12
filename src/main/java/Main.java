public class Main {
    public static void main(String[] args) {

        Phone Phone_1 = new Phone();
        System.out.println("Phone 1:");
        Phone.receiveCall("Igor");
        Phone.getNumber("8-919-118-01-18");
        System.out.println(" ");

        Phone Phone_2 = new Phone();
        System.out.println("Phone 2:");
        Phone.receiveCall("Work");
        Phone.getNumber("8-992-555-11-11");
        System.out.println(" ");

        Phone Phone_3 = new Phone();
        System.out.println("Phone 3:");
        Phone.receiveCall("Mom");
        Phone.getNumber("8-964-444-44-44");
    }
}
