package Onlinehandel.app;

import Onlinehandel.entities.Order;
import Onlinehandel.provided.Matcher;

public class OrderGt10kMatcher implements Matcher<Order> {

    @Override
    public boolean matches(Order order) {
        if (order.getTotal() >= 1000000) {
            return true;
        }
        return false;
    }
}
