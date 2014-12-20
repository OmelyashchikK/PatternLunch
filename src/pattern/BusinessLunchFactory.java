/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author asus
 */
public abstract class BusinessLunchFactory {

    public abstract Salad createSalad();

    public abstract Entre createEntre();

    public abstract MainCourse createMainCourse();

    public abstract Drinkables createDrinkables();

}

interface Salad {

    public void cut(int numberOfOrders);
}

interface Entre {

    public void boil(int numberOfOrders);
}

interface MainCourse {

    public void cook(int numberOfOrders);
}

interface Drinkables {

    public void brewing(int numberOfOrders);
}










