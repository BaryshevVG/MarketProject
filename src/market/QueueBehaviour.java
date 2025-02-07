package market;

public interface QueueBehaviour {
    void takeInQueue(Human human);  // Человек становится в очередь
    void releaseFromQueue();        // Человек уходит из очереди
}
