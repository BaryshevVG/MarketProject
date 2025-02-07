package market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        
        Human h1 = new Human("Иван");
        Human h2 = new Human("Анна");
        Human h3 = new Human("Олег");

        market.takeInQueue(h1);
        market.takeInQueue(h2);
        market.takeInQueue(h3);

        market.update(); // Принять и отдать заказ первому человеку
        market.update(); // Принять и отдать заказ второму человеку
        market.update(); // Принять и отдать заказ третьему человеку
    }
}
