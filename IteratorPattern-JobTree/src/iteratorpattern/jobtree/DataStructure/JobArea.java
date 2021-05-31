/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree.DataStructure;

import iteratorpattern.jobtree.Iterator.IteratorJobTree;
import iteratorpattern.jobtree.Iterator.Node;
import iteratorpattern.jobtree.Iterator.StaffIterator;
import java.util.ArrayList;

/**
 *
 * @author alega
 */
public class JobArea implements Node{
    private String areaName;
    public ArrayList<Node> listNodes;
    
    public JobArea(ArrayList<Node> listNodes, String areaName){
        this.areaName = areaName;
        this.listNodes = listNodes;
    }
    
    @Override
    public ArrayList getChildren() {
        return this.listNodes;
    }

    @Override
    public String getValue() {
        return this.areaName;
    }

    @Override
    public IteratorJobTree createIterator() {
        return new StaffIterator(this);
    }
    
}
