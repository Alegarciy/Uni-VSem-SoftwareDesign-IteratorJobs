/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree.Iterator;

/**
 *
 * @author alega
 */
public interface IteratorJobTree {
    public Node getNext();
    public boolean hasMore();
}
