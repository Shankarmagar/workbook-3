package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> inventory = readInventory();
        inventory.sort((a,b) -> a.getId() - b.getId());
        for(Product p: inventory)
        {
            System.out.println(p.getId() + " "+ p.getName());
        }


    }
    public static ArrayList<Product> getInventory()
    {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,"Laptop",2700.4));
        products.add(new Product(3,"Scissors",27.3));
        products.add(new Product(5,"TV",1400.46));
        products.add(new Product(8,"iphone ",1400.64));
        products.add(new Product(9,"Chair",300.54));
        products.add(new Product(4,"Bed",1700.74));

        return products;
    }

    public static ArrayList<Product> readInventory()
    {
        ArrayList<Product> products = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input = null;
            while((input = bufferedReader.readLine())!=null)
            {
                String [] fields = input.split(",");
                var i = Integer.parseInt(fields[0]);
                var name = fields[1];
                var price = Double.parseDouble(fields[2]);

                products.add(new Product(i, name, price));

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return products;
    }
}