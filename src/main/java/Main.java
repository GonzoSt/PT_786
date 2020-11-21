public class Main {
    public static void main(String[] args) {
        Phone Phone_1 = new Phone();
        Phone_1.number = "8-982-482-17-19";
        Phone_1.model = "Samsung A30s";
        Phone_1.weight = 50;

        System.out.println("Phone 1:");
        System.out.println("Number: " + Phone_1.number);
        System.out.println("Model: " + Phone_1.model);
        System.out.println("Weight: " + Phone_1.weight);
        System.out.println(" ");

        Phone Phone_2 = new Phone();
        Phone_2.number = "8-999-999-99-99";
        Phone_2.model = "Iphone XR";
        Phone_2.weight = 100;

        System.out.println("Phone 2:");
        System.out.println("Number: " + Phone_2.number);
        System.out.println("Model: " + Phone_2.model);
        System.out.println("Weight: " + Phone_2.weight);
        System.out.println(" ");

        Phone Phone_3 = new Phone();
        Phone_3.number = "8-902-102-10-10";
        Phone_3.model = "Xiaomi Redmi Note 6";
        Phone_3.weight = 150;

        System.out.println("Phone 3:");
        System.out.println("Number: " + Phone_3.number);
        System.out.println("Model: " + Phone_3.model);
        System.out.println("Weight: " + Phone_3.weight);
    }
}
