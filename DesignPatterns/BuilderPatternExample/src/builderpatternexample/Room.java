/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatternexample;

import java.util.Arrays;

/**
 *
 * @author Manjula Devapura
 */
public class Room {

    private final int roomNo;
    private final String type;
    private final String[] meals;
    private final String internet;
    private final boolean laundary;
    private final boolean pool;
    private final boolean gym;

    private Room(Builder builder) {
        this.roomNo = builder.roomNo;
        this.type = builder.type == null ? "normal" : builder.type;
        this.meals = builder.meals == null ? new String[0] : builder.meals;
        this.internet = builder.internet == null ? "" : builder.internet;
        this.laundary = builder.laundary;
        this.pool = builder.pool;
        this.gym = builder.gym;
    }

    static class Builder {

        private int roomNo;
        private String type;
        private String[] meals;
        private String internet;
        private boolean laundary;
        private boolean pool;
        private boolean gym;

        public Room build() {
            return new Room(this);
        }

        public Builder(int roomNo) {
            this.roomNo = roomNo;
        }

        public Builder type(String roomType) {
            this.type = roomType;
            return this;
        }

        public Builder meals(String[] meals) {
            this.meals = meals;
            return this;
        }

        public Builder internet(String internetType) {
            this.internet = internetType;
            return this;
        }

        public Builder laundary(boolean laundaryAvailability) {
            this.laundary = laundaryAvailability;
            return this;
        }

        public Builder pool(boolean poolAvailability) {
            this.pool = poolAvailability;
            return this;
        }

        public Builder gym(boolean gymAvailability) {
            this.gym = gymAvailability;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Room{" + "roomNo=" + roomNo + ", type=" + type + ", meals=" + Arrays.toString(meals) + ", internet=" + internet + ", laundary=" + laundary + ", pool=" + pool + ", gym=" + gym + '}';
    }

}
