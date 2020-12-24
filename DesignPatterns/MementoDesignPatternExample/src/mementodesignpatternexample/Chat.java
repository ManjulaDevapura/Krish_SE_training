/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpatternexample;

import java.util.ArrayList;

/**
 *
 * @author Manjula Devapura
 */
public class Chat {

    ArrayList<Message> messages = new ArrayList<>();
    ArrayList<Integer> messageOrder = new ArrayList<>();

    public void setMessages(Message message) {
        messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return (ArrayList< Message>) messages.clone();
    }

    @Override
    public String toString() {
        return "Chat{" + "messages=" + messages + '}';
    }

    public ChatMemento save() {
        return new ChatMemento(getMessages());
    }

    public void deleteMessage(ChatMemento cartMemento) {
        messages = cartMemento.getMessages();
    }

    public void printHistory() {
        messages.forEach(System.out::println);
    }

    static class ChatMemento {

        ArrayList<Message> messages;

        private ChatMemento(ArrayList<Message> messages) {
            this.messages = messages;
        }

        public ArrayList<Message> getMessages() {
            return messages;
        }

        @Override
        public String toString() {
            return "ChatMemento{" + "messages=" + messages + '}';
        }

    }
}
