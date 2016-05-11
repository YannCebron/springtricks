package springtips.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class OrderService {

    private ApplicationEventPublisher publisher;

    @Autowired
    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishOrderEvent(int orderId, boolean confirmed) {
        OrderEvent event = new OrderEvent(this, orderId, confirmed);
        publisher.publishEvent(event);
    }

}