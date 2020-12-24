/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpatternexample;

import java.util.Stack;

/**
 *
 * @author Manjula Devapura
 */
public class CareTaker {

    Stack<Chat.ChatMemento> history = new Stack<>();

    public void save(Chat chat) {
        history.add(chat.save());
    }

    public void revert(Chat chat) throws NoSuchFieldError {
        if (!history.isEmpty()) {
            chat.deleteMessage(history.pop());
        } else {
            throw new NoSuchFieldError("No any previous messages backup on Cloud ????? ");
        }
    }
}
