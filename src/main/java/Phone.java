public class Phone {

    public String number;
    public int weight;
    public String model;


    public void sendMessages (String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

//    public static void receiveCall (String callerName) {
//        System.out.println("Звонит " + callerName);
//    }
//
//    public static void receiveCall (String callerName, String callerNumber) {
//        System.out.println ("Звонит " + callerName + "\n" + "Номер: " + callerNumber);
//    }

//    public static void getNumber (String callerNumber) {
//        System.out.println(callerNumber);
//    }

//    public Phone (String number, int weight, String model) {
//       this (number, model);
//       this.weight = weight;
//    }
//
//    public Phone (String number, String model){
//        this.number = number;
//        this.model = model;
//    }
//
//    public Phone () {
//        number = "RndmNumber";
//        weight = 100;
//        model = "RndmModel";
//    }
}
