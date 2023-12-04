public class Main {
    public static void makeTea() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в пиалу");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }
    // Hi Sensei!

    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        addition(4, 3, "JAVA");
        addition(10, 5, "Programming is cool!");

        calculatePerimeter(6.0f, 4.5f, "Auditory 2");
        calculatePerimeter(4.0f, 3.5f, "Kitchen");
        calculatePerimeter(5.0f, 10.0f, "Hall");

        int areaOfAuditory2 = calculateArea(6.0f, 4.5f);
        System.out.println("Area of Auditory 2: " + areaOfAuditory2 + " square " + getUnit());
        int areaOfKitchen = calculateArea(4.0f, 3.5f);
        System.out.println("Area of Kitchen: " + areaOfKitchen + " square " + getUnit());
        int areaOfHall = calculateArea(5.0f, 10.0f);
        System.out.println("Area of Hall: " + areaOfHall + " square " + getUnit());
        System.out.println("TOTAL AREA: " + (areaOfAuditory2 + areaOfKitchen + areaOfHall)
                + " square " + getUnit());
    }

    public static String getUnit() {
        // возвращаемый метод без входящих параметров
        return "cm.";
    }

    public static int calculateArea(float length, float width) {
        // возвращаемый метод с входящими параметрами
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(float length, float width, String roomName) {
        // невозвращаемый метод с входящими параметрами
        float perimeter = 2 * (length + width);
        System.out.println("Perimeter of " + roomName + ": " + perimeter + " " + getUnit());
    }

    public static void addition(int num1, int num2, String phrase) {
        // невозвращаемый метод с входящими параметрами
        System.out.println("Сумма чисел: " + (num1 + num2));
        System.out.println("Фраза: " + phrase);
    }

    public static void duration() {
        // невозвращаемый метод без входящих параметров
        System.out.println("Длительность: 15 мин");
    }
}
