package semester2.Pertemuan15;

import java.util.ArrayList;

public class DemoArrayList19 {
    public static void main(String[] args) {
        ArrayList<Customer19> customers = new ArrayList<>(2);

        Customer19 customer1 = new Customer19(1, "Zakia");
        Customer19 customer2 = new Customer19(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer19(4, "Cica"));
        customers.add(2, new Customer19(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer19 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer19> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer19(201, "Della"));
        newCustomers.add(new Customer19(202, "VIctor"));
        newCustomers.add(new Customer19(203, "Sarah"));

        customers.addAll(newCustomers);

        System.out.println(customers);
        for (Customer19 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println("=====================");
        customers.sort((c1,c2)->c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
