package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Order {
// TODO: Учет заказов:
//  Создайте класс Order с полями id, customer и totalAmount.
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

    static Integer customerID = 1;
    static Integer orderID = 1;
    String customer;
    Integer totalAmount;
    String orderData;

    Map<Integer, String> customersMap = new HashMap<>();
    Map<Integer, String> ordersMap = new HashMap<>();
    ArrayList<Integer> ordersList = new ArrayList<>();

    public void ordersMaker(String customer, String orderData, Integer totalAmount) {
        customersMap.put(customerID, this.customer);
        customerID++;
        ordersMap.put(orderID, this.orderData);
        orderID++;
        ordersList.add(orderID, totalAmount);
    }

    public void getMaxAmountOrder() {
        System.out.println(Collections.max(ordersList));
    }

    public void getOrdersAmountSumm() {
        Integer summ = 0;
        for (int i = 0; i < ordersList.size(); i++)
            summ += ordersList.get(i);
        System.out.println(summ);
    }

    }

    public class OrderTesting {
        public static void main(String[] args) {
//        Order order1 = new Order.ordersMaker("Ivanov", "Tea, Donut", 300);
//        Order order2 = new Order.ordersMaker("Petrov", "Cofee, CheeseCake", 400);
//        Order order3 = new Order.ordersMaker("Sidorov", "Lemonade, Cookie", 250);
//        Order order4 = new Order.ordersMaker("Vasin", "Orange fresh, sandwich", 500);
//
//        Order.getMaxAmountOrder();
//
//        Order.getOrdersAmountSumm();
        }

    }