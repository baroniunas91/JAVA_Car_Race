/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrace;

/**
 *
 * @author Edgaras
 */
public class Car {

    private String name;
    private int speed;
    private int maxSpeed;
    private int distance;
//2 Konstruktoriai
    public Car(String name, int maxSpeed) {
        super();
        this.name = name;
        this.speed = 0;
        this.maxSpeed = maxSpeed;
        this.distance = 0;
    }

    public Car(String name) {
        this(name, 200);
    }
//Getter'iai
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getDistance() {
        return distance;
    }
//Setter'iai
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
//Metodai
    public void accelerate(int kiek) {
        if (kiek + this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
        } else {
            this.speed += kiek;
        }
    }

    public void brake(int kiek) {
        if (this.speed - kiek < 0) {
            this.speed = 0;
        } else {
            this.speed -= kiek;
        }
    }

    public void drive() {
        this.distance += this.speed;
    }

}
