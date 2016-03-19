package org.xdang.codemound.visitor;

/**
 * Created by xdang on 16/3/19.
 */
public interface ICarElement {
    void accept(ICarElementVisitor visitor);
}
