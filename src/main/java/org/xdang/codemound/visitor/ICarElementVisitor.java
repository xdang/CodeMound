package org.xdang.codemound.visitor;

/**
 * Created by xdang on 16/3/19.
 */
public interface ICarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
