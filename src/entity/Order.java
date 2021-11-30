package entity;

//import model.OrderDetail;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;

@Entity
public class Order {
    @Id
    private String orderId;
    private String orderDate;
    private String customerId;
    private String orderTime;
    private double orderCost;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private ArrayList<OrderDetail> detailList=new ArrayList<>();

    public Order(String orderId, String orderDate, String customerId, String orderTime, String time, double orderCost) {
    }

    public Order(String orderId, String orderDate, String customerId, String orderTime, double orderCost) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.orderTime = orderTime;
        this.orderCost = orderCost;
    }

    public Order(String orderId, String orderDate, String customerId, String orderTime, double orderCost, Customer customer, ArrayList<OrderDetail> detailList) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.orderTime = orderTime;
        this.orderCost = orderCost;
        this.customer = customer;
        this.detailList = detailList;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(double orderCost) {
        this.orderCost = orderCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(ArrayList<OrderDetail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderCost=" + orderCost +
                ", customer=" + customer +
                ", detailList=" + detailList +
                '}';
    }
}
