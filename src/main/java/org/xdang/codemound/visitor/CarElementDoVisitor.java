package org.xdang.codemound.visitor;

/**
 * Created by xdang on 16/3/19.
 */
public class CarElementDoVisitor implements ICarElementVisitor{
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    public void visit(Car car) {
        System.out.println("Starting my car");
    }
}
