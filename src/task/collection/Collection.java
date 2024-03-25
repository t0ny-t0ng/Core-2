package task.collection;


// Реализуйте функциональность согласно описанию
// TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        // TODO: Найти наибольший элемент в списке.
        ArrayList<Integer> intList1 = new ArrayList<>();
        intList1.add(13);
        intList1.add(3);
        intList1.add(6);
        intList1.add(11);
        intList1.add(2);
        System.out.println("Наибольший элемент в списке: " + Collections.max(intList1) + '\n');

        // TODO: Удалить все дубликаты из списка.
        ArrayList<Integer> intList2 = new ArrayList<>();
        intList2.add(13);
        intList2.add(3);
        intList2.add(6);
        intList2.add(13);
        intList2.add(2);
        intList2.add(13);
        Set<Integer> intSet2 = new HashSet<>(intList2);
        intList2.addAll(intSet2);
        System.out.println("Список после удаления дубликатов: " + intSet2 + '\n');

        // TODO: Отсортировать список в порядке убывания.
        ArrayList<Integer> intList3 = new ArrayList<>();
        intList3.add(9);
        intList3.add(3);
        intList3.add(8);
        intList3.add(1);
        intList3.add(7);
        intList3.add(4);
        intList3.sort(Comparator.reverseOrder());
        System.out.println("Список после сортировки в обратном порядке: " + intList3 + '\n');

        // TODO: Проверить, содержит ли множество определенный элемент.
        ArrayList<Integer> intList4 = new ArrayList<>();
        intList4.add(9);
        intList4.add(3);
        intList4.add(8);
        intList4.add(1);
        intList4.add(7);
        intList4.add(4);
        if (intList4.contains(8)) {
            System.out.println("Множество содержит элемент '8'." + '\n');
        }

        // TODO: Найти пересечение двух множеств.
        ArrayList<Integer> intList5 = new ArrayList<>();
        intList5.add(9);
        intList5.add(3);
        intList5.add(8);
        intList5.add(1);
        intList5.add(7);
        intList5.add(4);

        ArrayList<Integer> intList6 = new ArrayList<>();
        intList6.add(19);
        intList6.add(13);
        intList6.add(8);
        intList6.add(11);
        intList6.add(17);
        intList6.add(4);

        ArrayList<Integer> intList5Copy = new ArrayList<>(intList5);
        intList5Copy.retainAll(intList6);

        System.out.println("Список 5: " + intList5 + '\n' + "Список 6: " + intList6 + '\n' + "Повторяющиеся значения в списках 5 и 6: " + intList5Copy + '\n');

        // TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.

        ArrayList<Integer> intList8 = new ArrayList<>();
        intList8.add(11);
        intList8.add(22);
        intList8.add(33);
        intList8.add(44);
        intList8.add(55);
        intList8.add(66);

        ArrayList<Integer> intList9 = new ArrayList<>();
        intList9.add(77);
        intList9.add(88);
        intList9.add(99);
        intList9.add(100);
        intList9.add(11);
        intList9.add(22);

        ArrayList<Integer> intList8Copy = new ArrayList<>(intList8);
        intList8Copy.removeAll(intList9);
        System.out.println("Список 8: " + intList8 + '\n' + "Список 9: " + intList9 + '\n' + "Уникальные значения в списке 8: " + intList8Copy + '\n');

        // TODO: Проверить, содержит ли карта определенный ключ.
        Map<Integer, String> spAgents = new HashMap<>();
        spAgents.put(10016, "P.Denton");
        spAgents.put(10017, "JC.Denton");
        spAgents.put(10018, "A.Jacobson");
        spAgents.put(10019, "J.Manderley");
        if (spAgents.containsKey(10017)) {
            System.out.println("Карта содержит данный ключ." + '\n');

            // TODO: Получить все значения, связанные с определенным ключом.
            Map<Integer, String> employees = new HashMap<>();
            employees.put(993, "A.Ivanov");
            employees.put(994, "B.Petrov");
            employees.put(995, "P.Sidorov");
            employees.put(996, "K.Vasin");
            System.out.println(employees.get(995) + '\n');

            // TODO: Удалить все записи из карты, у которых значение равно определенному значению.
            Map<Integer, String> residents = new HashMap<>();
            residents.put(12, "Pechkin");
            residents.put(13, "Pechkina");
            residents.put(14, "Pechkin");
            residents.put(15, "Kotova");
            residents.put(16, "Pechkina");
            String valueToRemove = "Pechkin";
            residents.values().removeIf(valueToRemove::equals);
            System.out.println(residents);
            System.out.println();

// TODO: Добавить элемент в очередь.
            Queue<String> cocktails = new LinkedList<String>();
            cocktails.add("Long Island");
            cocktails.add("Mohito");
            cocktails.add("Blue Lagoon");
            cocktails.add("Sex on the beach");
            cocktails.add("Cuba Libre");
            System.out.println(cocktails);
            System.out.println();

// TODO: Получить и удалить первый элемент из очереди.
            System.out.println(cocktails.poll());
            System.out.println(cocktails);
            System.out.println();

// TODO: Проверить, пуста ли очередь.
            if (cocktails.isEmpty()) {
                System.out.println("Очередь пуста");
            } else {
                System.out.println("Очередь не пуста");
            }

        }

    }


//------------------------------------------------------------------



// TODO: Управление задачами:
//  Создайте класс Task с полями id, title и completed.
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.

// TODO: Создание списка студентов:
//  Создайте класс Student с полями name и age.
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id, name и quantity.
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name и attendance.
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.

}