package Onlinehandel.app;

import Onlinehandel.entities.InternationalOrder;
import Onlinehandel.entities.Item;
import Onlinehandel.entities.Order;
import Onlinehandel.entities.RegionalOrder;
import Onlinehandel.provided.Costumer;
import Onlinehandel.provided.DateTime;
import Onlinehandel.provided.Matcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Onlinehandel demo application
 */
public class Main {
	private static List<Order> deliveries;
	static {
		// ------- items
		LinkedList<Item> items = new LinkedList<>();
		items.add(new Item("Dell H2412", 16, 45099));
		items.add(new Item("Lenovo ThinkPad", 11, 180000));
		items.add(new Item("Iphone 6", 8, 70000));
		items.add(new Item("S9", 32, 90000));

		// ------- costumers
		List<Costumer> costumers = new LinkedList<>();
		costumers.add(new Costumer("Hans Krankl", "Hütteldorf", true));
		costumers.add(new Costumer("Peter Schöttl", "Hütteldorf", true));
		costumers.add(new Costumer("Franz Wohlfahrt Krankl", "Reichsbrücke", false));

		// ------- deliveries
		deliveries = new LinkedList<>();

		// ---
		Order d = new InternationalOrder(120120210L, costumers.get(0), items);
		deliveries.add(d);

		// ---
		d = new RegionalOrder(120133210L, costumers.get(1), items.subList(0, 2));
		d.collect(new DateTime(2018,11,20,18,00));
		deliveries.add(d);
		
		
		// ---
		d = new RegionalOrder(120133210L, costumers.get(2), items.subList(0,1));
		d.addItems(items.get(3));
		d.addItems(items.get(2));
		d.collect(new DateTime(2018,11,20,18,00));
		d.deliver(new DateTime(2018,11,20,21,00));
		deliveries.add(d);

	}

	/**
	 * Demo application.
	 * 
	 * <ul>
	 * <li>prints the test data using {@link print}</li>
	 * <li>sorts them by order id</li>
	 * <li>prints them again (sorted)</li>
	 * <li>filters orders, keeping those that are currently collected but not delivered</li>
	 * <li>prints the filtered orders again</li>
	 * <li>exports the filtered orders to file orders_on_route.txt and
	 * displays the number of orders exported
	 * </ul>
	 * 
	 * @param args (not used)
	 */
	public static void main(String[] args) {

		print(deliveries);

		Collection<Order> filteredOrders = new ArrayList<>();
		Matcher<Order> myMatcher = new OrderGt10kMatcher();
		for (Order o : deliveries) {
			if (myMatcher.matches(o)) {
				filteredOrders.add(o);
			}
		}

		System.out.println("FILTERED:");
		print(filteredOrders);
		
	}

	

	/**
	 * Prints orders line by line.<br>
	 * <br>
	 * Adds a short header before printing the String representation of all
	 * deliveries line by line. For a single delivery the standard string
	 * representation provided by Delivery.toString() is used.<br>
	 * <br>
	 * 
	 * @param deliveries the deliveries to print.
	 * 
	 * @ProgrammingProblem.Hint provided
	 */
	public static void print(Collection<Order> deliveries) {
		System.out.println("\n--- Orders");
		for (Order d : deliveries)
			System.out.println(d);

	}

}
