package Onlinehandel.entities;

import java.time.LocalDateTime;
import java.util.*;

import Onlinehandel.provided.*;

/**
 * An order within the Onlinehandel.<br>
 * <br>
 * 
 * An order holds information on the costumer placing the order, the items
 * ordered and the status of the order which captures collection and delivery
 * date and time.<br>
 * <br>
 * 
 * The usual life cycle is
 * <ul>
 * <li>create an order with id, costumer and at least one item</li>
 * <li>add items</li>
 * <li>collect</li>
 * <li>deliver</li>
 * </ul>
 *
 */
public abstract class Order implements Comparable<Order> {


	protected DateTime collected;
	protected DateTime delivered;
	protected long id;
	protected Costumer costumer;
	protected Set<Item> goods = new HashSet<>();
	protected String str;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Costumer getCostumer() {
		return new Costumer(costumer);
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public Set<Item> getItems() {
		Set<Item> goodsCopy = new HashSet<>();
		for (Item i: goods){
				goodsCopy.add(new Item(i.getDescription(), i.getAmount(), i.getValue()));

		}

		return goodsCopy;
	}

	public void setItems(Collection<Item> items) {
		this.goods.addAll(items);
	}

	public String ensureNonNullEmpty(String str){
		if (str != null && str != ""){
			return this.str;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Order(long id, Costumer costumer, Collection<Item> items ){
		if (id > 0) {
			this.id = id;
		} else {
			throw new IllegalArgumentException();
		}
		if( costumer != null) {
			this.costumer = costumer;
		} else {
			throw new IllegalArgumentException();
		}
		this.goods.addAll(items);

	}
	public Order(Order order){
		this.id = order.getId();
		this.costumer = new Costumer(order.getCostumer());
		this.goods = order.getItems();
	}


	public abstract int getTotal();
	
	public boolean isCollected(){
		if(collected != null){
			return true;
		}
		return false;

	}

	public boolean isDelivered(){
		if(delivered != null){
			return true;
		}
		return false;

	}

	public boolean addItems(Item item){
		if (isDelivered() || isCollected()){
			return false;
		}
		goods.add(item);
		return true;
	}

	public boolean addItems(Collection<Item> items){
		if (isDelivered() || isCollected()){
			return false;
		}
		for (Item i: items){
			if(!items.contains(i)) {
				goods.add(i);
			}
		}
		return true;
	}

	public boolean deliver(DateTime date){
		if (isDelivered() || !isCollected()){
			return false;
		} else {
			delivered = date;
			return true;
		}

	}
	public boolean collect(DateTime date){
		if (isCollected()){
			return false;
		}
		collected = date;
		return true;
	}

	@Override
	public int compareTo(Order o) {
		return Long.compare(this.id, o.id);
	}

	/**
	 * creates a string representation of this delivery.<br>
	 * 
	 * @ProgrammingProblem.Hint provided
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%d " + "[%scollected, %sdelivered] (EUR %.2f)\n" + "%s", //
				id, isCollected() ? "" : "not ", isDelivered() ? "" : "not ", getTotal() / 100.,
				printGoods());
	}

	private String printGoods(){
		StringBuilder g = new StringBuilder();
		this.goods.forEach(i -> {
			g.append(i.toString());
			g.append(" ");
		});

		return g.toString();
	}



}
