public class Main {
    public static void main(String[] args) {
        Phone Phone_1 = new Phone();
        Phone_1.number = "Num_1";
        Phone_1.model = "Model_1";
        Phone_1.weight = 50;

        System.out.println("Phone 1:");
        System.out.println("Number: " + Phone_1.number);
        System.out.println("Model: " + Phone_1.model);
        System.out.println("Weight: " + Phone_1.weight);
        Phone.receiveCall("Name_1");
        Phone.getNumber(Phone_1.number + "\n");

        Phone Phone_2 = new Phone();
        Phone_2.number = "Num_2";
        Phone_2.model = "Model_2";
        Phone_2.weight = 100;

        System.out.println("Phone 2:");
        System.out.println("Number: " + Phone_2.number);
        System.out.println("Model: " + Phone_2.model);
        System.out.println("Weight: " + Phone_2.weight);
        Phone.receiveCall("Name_2");
        Phone.getNumber(Phone_2.number + "\n");

        Phone Phone_3 = new Phone();
        Phone_3.number = "Num_3";
        Phone_3.model = "Model_3";
        Phone_3.weight = 150;

        System.out.println("Phone 3:");
        System.out.println("Number: " + Phone_3.number);
        System.out.println("Model: " + Phone_3.model);
        System.out.println("Weight: " + Phone_3.weight);
        Phone.receiveCall("Name_3");
        Phone.getNumber(Phone_3.number + "\n");

        Phone.receiveCall("RndmName", "RndmNumber" + "\n");
        Phone.sendMessages("Send messages:" + "\n" + "Num_1", "Num_2", "Num_3", "Num_4" + "\n");

        Person Person = new Person();
        Person.getPersonName();
        Person.getNumber();
        System.out.println("\n");

        SmartPhone SmartPhone = new SmartPhone();
        SmartPhone.receiveCall("callerName");
        SmartPhone.getNumber("callerNumber");
        SmartPhone.sendMessages("num1", "num2", "num3");
    }



}
