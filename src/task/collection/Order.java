package task.collection;

// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Order {

    private int id;
    private String customer;
    private int totalAmount;

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(int id, String customer, int totalAmount) {
        this.setId(id);
        this.setCustomer(customer);
        this.setTotalAmount(totalAmount);
    }

    public String toString() {
        return "Order{" + "id='" + getId() + '\'' + ", customer=" + getCustomer() + '\'' +
                ", total amount = " + getTotalAmount();

    }



    public static void main(String[] args) {

        Order order1 = new Order(334, "Ivanov", 350);

        Order order2 = new Order(335, "Petrov", 450);

        Order order3 = new Order(336, "Vasin", 500);

        List<Order> ordersList = new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);

        Order maxAmountOrder = ordersList.stream().max((x, y) -> x.getTotalAmount() - y.getTotalAmount()).get();
        System.out.println("max amount order = " + maxAmountOrder);





        }
    }






