package org.xdang.codemound.visitor;

/**
 * Created by xdang on 16/3/19.
 */
public class VisitorDemo {
    public static void main(String[] args) {
        ICarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
