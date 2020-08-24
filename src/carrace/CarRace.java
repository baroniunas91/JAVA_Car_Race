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
public class CarRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int trackLength = 1000;
        boolean race = true;
        Car winner;

        Car m1 = new Car("Car1", 220);
        Car m2 = new Car("Car2");
        Car m3 = new Car("Car3", 240);
        Car m4 = new Car("Car4", 260);
        Car m5 = new Car("Car5", 190);
        Car m6 = new Car("Car6", 210);
        SportsCar m7 = new SportsCar("SportsCar7", 300, true);
        SportsCar m8 = new SportsCar("SportsCar8", 280, false);

        Car allCars[] = new Car[]{
            m1,
            m2,
            m3,
            m4,
            m5,
            m6
        };
        SportsCar allSportsCars[] = new SportsCar[]{
            m7,
            m8
        };

        for (int i = 0; race; i++) {
            System.out.print(i);
            System.out.println(" ----------------------------");
            //Keiciam spoileri kiekvienai sportinei masinai su 50 proc tikimybe
            for (int j = 0; j < allSportsCars.length; j++) {
                if (Math.random() < 0.5) {
                    allSportsCars[j].setSpoiler(allSportsCars[j].getSpoiler());
                }
//                Gazuojam su 50proc.tikimybe
                if (Math.random() < 0.5) {
                    allSportsCars[j].accelerate((int) (Math.random() * 5 + 1));
                    allSportsCars[j].drive();
//                    Satbdom su 20 proc. tikimbe
                } else if (Math.random() > 0.8) {
                    allSportsCars[j].brake((int) (Math.random() * 3 + 1));
                    allSportsCars[j].drive();
//                    Vaziuojam tuo paciu greiciu
                } else {
                    allSportsCars[j].drive();
                }
            }
            for (int z = 0; z < allCars.length; z++) {
//                Gazuojam su 50 proc tikimybe
                if (Math.random() < 0.5) {
                    allCars[z].accelerate((int) (Math.random() * 5 + 1));
                    allCars[z].drive();
                    //Stabdom su 20proc. tikimybe
                } else if (Math.random() > 0.8) {
                    allCars[z].brake((int) (Math.random() * 3 + 1));
                    allCars[z].drive();
                    //Vaziuojam tuo paciu greiciu
                } else {
                    allCars[z].drive();
                }
            }

            Car allCarsResultsAfterOneCycle[] = new Car[]{m1, m2, m3, m4, m5, m6, m7, m8};

            for (int n = 0; n < allCarsResultsAfterOneCycle.length - 1; n++) {
                for (int m = n + 1; m < allCarsResultsAfterOneCycle.length; m++) {
                    if (allCarsResultsAfterOneCycle[n].getDistance() < allCarsResultsAfterOneCycle[m].getDistance()) {
                        Car temp = allCarsResultsAfterOneCycle[n];
                        allCarsResultsAfterOneCycle[n] = allCarsResultsAfterOneCycle[m];
                        allCarsResultsAfterOneCycle[m] = temp;
                    } else if (allCarsResultsAfterOneCycle[n].getDistance() == allCarsResultsAfterOneCycle[m].getDistance()) {
                        if (allCarsResultsAfterOneCycle[n].getSpeed() < allCarsResultsAfterOneCycle[m].getSpeed()) {
                            Car temp = allCarsResultsAfterOneCycle[n];
                            allCarsResultsAfterOneCycle[n] = allCarsResultsAfterOneCycle[m];
                            allCarsResultsAfterOneCycle[m] = temp;
                        }
                    }
                }
            }

            for (int j = 0; j < allCarsResultsAfterOneCycle.length; j++) {
                System.out.print(allCarsResultsAfterOneCycle[j].getName());
                System.out.print(" distance - ");
                System.out.print(allCarsResultsAfterOneCycle[j].getDistance());
                System.out.print(" speed - ");
                System.out.println(allCarsResultsAfterOneCycle[j].getSpeed());
            }

            for (int l = 0; l < allCarsResultsAfterOneCycle.length; l++) {
                if (allCarsResultsAfterOneCycle[l].getDistance() >= trackLength) {
                    race = false;
                    break;
                }
            }
            if (race == false) {
                winner = allCarsResultsAfterOneCycle[0];
                System.out.println(" ----------------------------");
                System.out.print("Winner: ");
                System.out.println(winner.getName());
            }
        }
    }
}
