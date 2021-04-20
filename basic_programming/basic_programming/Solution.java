package basic_programming;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle v[] = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double pr = sc.nextDouble();
            v[i] = new Vehicle(num, name, pr);
        }
        sc.nextLine();
        String findName = sc.nextLine();
        print(searcVehicleByName(v, findName));
        print(findVehicleWithMinimumPrice(v));
        sc.close();

    }

    static void print(Vehicle v) {
        if (v == null) {
            System.out.println("no vehicle found");
        } else {
            System.out.println(v.getNumber());
            System.out.println(v.getName());
            System.out.println(v.getPrice());
        }
    }

    public static Vehicle searcVehicleByName(Vehicle[] vl, String name) {
        for (int i = 0; i < vl.length; i++) {
            if (vl[i].getName().equals(name)) {
                return vl[i];
            }
        }
        return null;
    }

    public static Vehicle findVehicleWithMinimumPrice(Vehicle[] vl) {
        Vehicle minPrice = vl[0];
        for (int i = 1; i < vl.length; i++) {
            if (vl[i].getPrice() < minPrice.getPrice()) {
                minPrice = vl[i];
            }
        }
        return minPrice;
    }

}

class Vehicle {
    private int number;
    private String name;
    private double price;

    public Vehicle(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}
