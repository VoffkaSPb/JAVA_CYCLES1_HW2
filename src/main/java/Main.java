import ru.netology.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService number = new SQRService();
        int leftLimit = 200;
        int rightLimit = 300;
        int x = number.limits(leftLimit, rightLimit);
        System.out.println("Количество чисел входящих в диапозон: " + x);

    }
}