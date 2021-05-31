/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree.Iterator;

import java.util.ArrayList;

/**
 *
 * @author alega
 */
public interface Node {
    public ArrayList<Node> getChildren();
    public String getValue();
    public IteratorJobTree createIterator();
}
