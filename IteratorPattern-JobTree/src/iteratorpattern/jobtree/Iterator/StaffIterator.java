/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree.Iterator;

import iteratorpattern.jobtree.DataStructure.Staff;
import java.util.ArrayList;

/**
 *
 * @author alega
 */
public class StaffIterator implements IteratorJobTree {
    private ArrayList<Node> arrayTreeNodes = new ArrayList<>();
    
    public StaffIterator(Node root){
        // corrida
        this.getStaffArray(root);
    }
    
    public void getStaffArray(Node root){
        if(root instanceof  Staff){
            this.arrayTreeNodes.add(root);
        }
        else
        {
            for (Node child : root.getChildren()) {
                getStaffArray(child);
            }
        }
    }

    @Override
    public Node getNext() {
        if(this.hasMore()) {
            Node currentNode = this.arrayTreeNodes.get(0);
            this.arrayTreeNodes.remove(0);
            return currentNode;
        } else {
            return null;
        }
        
    }

    @Override
    public boolean hasMore() {
        return !this.arrayTreeNodes.isEmpty();
    }
    
}
