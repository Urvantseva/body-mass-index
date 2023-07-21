public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.73; // Рост
        int weight = 50; // Вес

        double index = (int) (service.calculate(height, weight));

        System.out.println("Индекс массы тела: " + Math.round(index));
    }
}