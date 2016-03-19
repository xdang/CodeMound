package org.xdang.codemound.visitor;

/**
 * Created by xdang on 16/3/19.
 */
public class Body implements ICarElement {
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
