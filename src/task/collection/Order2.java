package task.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//первая версия класса Ордер, не верная, переименован в Ордер2
public class Order2 {
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

    public String ordersMaker(String customer, String orderData, Integer totalAmount) {
        customersMap.put(customerID, this.customer);
        customerID++;
        ordersMap.put(orderID, this.orderData);
        orderID++;
        ordersList.add(orderID, totalAmount);
        return customer + orderData;
    }

    public Integer getMaxAmountOrder() {
        return Collections.max(ordersList);
    }

    public Integer getOrdersAmountSumm() {
        Integer summ = 0;
        for (int i = 0; i < ordersList.size(); i++)
            summ += ordersList.get(i);
        return summ;
    }


    public static void main(String[] args) {

        Order2 O1 = new Order2();
        Order2 O2 = new Order2();
        Order2 O3 = new Order2();
        Order2 O4 = new Order2();
        Order2 O5 = new Order2();
        Order2 O6 = new Order2();
        O1.ordersMaker("Ivanov", "Tea, Donut", 300);
        O2.ordersMaker("Petrov", "Cofee, CheeseCake", 400);
        O3.ordersMaker("Sidorov", "Lemonade, Cookie", 250);
        O4.ordersMaker("Vasin", "Orange fresh, sandwich", 500);

        O5.getMaxAmountOrder();

        O6.getOrdersAmountSumm();
    }

}