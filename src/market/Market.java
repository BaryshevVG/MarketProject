package market;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Human> queue = new LinkedList<>();

    @Override
    public void takeInQueue(Human human) {
        queue.add(human);
        System.out.println(human.getName() + " встал в очередь.");
    }

    @Override
    public void releaseFromQueue() {
        Human human = queue.poll();
        if (human != null) {
            System.out.println(human.getName() + " покинул очередь.");
        }
    }

    @Override
    public void acceptOrder() {
        if (!queue.isEmpty()) {
            System.out.println("Магазин принял заказ от " + queue.peek().getName());
        }
    }

    @Override
    public void giveOrder() {
        if (!queue.isEmpty()) {
            System.out.println("Магазин выдал заказ " + queue.peek().getName());
            releaseFromQueue();
        }
    }

    public void update() {
        if (!queue.isEmpty()) {
            acceptOrder();
            giveOrder();
        }
    }
}
