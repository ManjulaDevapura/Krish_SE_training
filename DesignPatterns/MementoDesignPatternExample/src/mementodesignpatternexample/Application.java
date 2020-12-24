/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Chat chatBox = new Chat();

        try {

            chatBox.setMessages(new Message("Hi I am Manjula.", MessengerType.SENDER));
            careTaker.save(chatBox);
            chatBox.setMessages(new Message("Hi I am Devapura.", MessengerType.REPLIER));
            careTaker.save(chatBox);

            chatBox.setMessages(new Message("How are you ?", MessengerType.SENDER));
            careTaker.save(chatBox);

            chatBox.setMessages(new Message("I am fine", MessengerType.REPLIER));
            chatBox.setMessages(new Message("What about you ?", MessengerType.REPLIER));
            careTaker.save(chatBox);

            chatBox.setMessages(new Message("I am good", MessengerType.SENDER));
            careTaker.save(chatBox);
            System.out.println(chatBox);

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            System.out.println("\n\nDeleting previous messeging session !!!");
            careTaker.revert(chatBox);
            chatBox.printHistory();

            
        } catch (NoSuchFieldError ex) {
            System.out.println(ex.getMessage());
        } finally {
            chatBox.printHistory();
        }
    }

}
