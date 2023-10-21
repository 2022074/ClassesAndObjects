/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author achap
 */
public class Circle extends Shape{
    private double radius = 12.5;
    private Boolean isFilled;
    private String colour;

    public double getRadius() {
        return radius;
    }
    
    @Override
    public double getArea() {
        return radius * radius * 3.1416;
    }
    
}
