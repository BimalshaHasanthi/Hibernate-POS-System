package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetail {
    @Id
    private String orderId;
    @Id
    private String itemCode;
    private double unitPrice;
    private int orderQty;
    private double discount;
    private double price;


    @ManyToOne
    private Order order;
    @ManyToOne
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, String itemCode, double unitPrice, int orderQty, double discount, double price) {
        this.setOrderId(orderId);
        this.setItemCode(itemCode);
        this.setUnitPrice(unitPrice);
        this.setOrderQty(orderQty);
        this.setDiscount(discount);
        this.setPrice(price);
    }

    public OrderDetail(String orderId, String itemCode, double unitPrice, int orderQty, double discount, double price, Order order, Item item) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.unitPrice = unitPrice;
        this.orderQty = orderQty;
        this.discount = discount;
        this.price = price;
        this.order = order;
        this.item = item;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", unitPrice=" + unitPrice +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                ", price=" + price +
                ", order=" + order +
                ", item=" + item +
                '}';
    }
}
