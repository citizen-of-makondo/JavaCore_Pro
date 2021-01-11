package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();

    }

    private static void exercise1() {
        String[] strings = new String[]{
                "Пушкин", "Лермонтов", "Достоевский", "Толстой", "Фет", "Ремарк", "Пушкин",
                "Пушкин", "Достоевский", "Пушкин", "Лермонтов", "Фет", "Фет", "Ремарк", "Достоевский"
        };

        Set<String> set = new HashSet<>(Arrays.asList(strings));
        for (String s : set) {
            int count = checkWord(s, strings);
            System.out.println("Слово " + s + " встречается " + count + " раз(а)");
        }
    }

    private static int checkWord(String word, String[] strings) {
        int a = 0;
        for (String s : strings) {
            if (word == s) a++;
        }
        return a;
    }

  /*  private static void exercise2() {
        HashMap<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee("Ivanov Ivan", "123456789"));
        map.put(2, new Employee("Petrov Petr", "123456798"));
        map.put(3, new Employee("Ivanov Ivan", "001"));

    }*/

    private static void exercise2() {
        ArrayList<Employee> list = new ArrayList<>();

    }

}

class Employee  {
    private String name;
    private String phone;

    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}

