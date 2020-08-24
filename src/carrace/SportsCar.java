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
public class SportsCar extends Car {

    private boolean spoiler;
//Konstruktoriai
    public SportsCar(String name, int maxSpeed, boolean spoiler) {
        super(name, maxSpeed);
        this.spoiler = spoiler;
    }

    public SportsCar(String name) {
        this(name, 200, true);
    }
//Geteriai
    public boolean getSpoiler() {
        return spoiler;
    }
//Seteriai
    public void setSpoiler(boolean spoiler) {
        if (spoiler == true) {
            this.spoiler = false;
        } else {
            this.spoiler = true;
        }
    }
//Metodai
    public void accelerate(int kiek) {
        if (spoiler == false) {
            if (kiek + this.getSpeed() > this.getMaxSpeed()) {
                this.setSpeed(this.getMaxSpeed());
            } else {
                this.setSpeed(this.getSpeed() + (2 * kiek));
            }
        } else {
            super.accelerate(kiek);
        }
    }

    public void brake(int kiek) {
        if (spoiler == true) {
            if (this.getSpeed() - kiek < 0) {
                this.setSpeed(0);
            } else {
                this.setSpeed(getSpeed() - (2 * kiek) );
                
            }
        } else {
            super.brake(kiek);
        }
    }

}
