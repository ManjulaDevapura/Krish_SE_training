/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room.Builder builder = new Room.Builder(123);
        Room room = builder.build();
        System.out.println(room);

        Room.Builder builder1 = new Room.Builder(1234);
        Room room1 = builder1.type("Lux").build();
        System.out.println(room1);

        String[] meals2 = {"Breakfast"};
        Room.Builder builder2 = new Room.Builder(12345);
        Room room2 = builder2.type("Lux").meals(meals2).build();
        System.out.println(room2);
        
        String[] meals3 = {"Breakfast","Lunch"};
        Room.Builder builder3 = new Room.Builder(12345);
        Room room3 = builder3.type("Lux").meals(meals3).internet("WiFi").pool(true).build();
        System.out.println(room3);
        
    }

}
