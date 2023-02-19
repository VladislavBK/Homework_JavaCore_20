public class Main {
    public static void main(String[] args) {
        AutoDealer autoDealer = new AutoDealer();
        autoDealer.startProduction();
        autoDealer.buyer("Первый покупатель", 2);
        autoDealer.buyer("Второй покупатель", 4);
        autoDealer.buyer("Третий покупатель", 8);
    }
}
