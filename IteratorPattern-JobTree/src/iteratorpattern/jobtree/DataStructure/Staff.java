/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree.DataStructure;

import iteratorpattern.jobtree.Iterator.IteratorJobTree;
import iteratorpattern.jobtree.Iterator.Node;
import java.util.ArrayList;

/**
 *
 * @author alega
 */
public class Staff implements Node{
    private String name;
    
    public Staff(String name){
        this.name = name;
    }

    @Override
    public ArrayList getChildren() {
        return null;
    }

    @Override
    public String getValue() {
        return this.name;
    }

    @Override
    public IteratorJobTree createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
