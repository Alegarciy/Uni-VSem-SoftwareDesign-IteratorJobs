/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern.jobtree;

import iteratorpattern.jobtree.DataStructure.JobArea;
import iteratorpattern.jobtree.DataStructure.Staff;
import iteratorpattern.jobtree.Iterator.IteratorJobTree;
import iteratorpattern.jobtree.Iterator.Node;
import java.util.ArrayList;

/**
 *
 * @author alega
 */
public class IteratorPatternJobTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Node> array = new ArrayList<Node>();
        array.add(new Staff("Kevin"));
        array.add(new Staff("Ale"));
        array.add(new Staff("Jorge"));
        ArrayList<Node> array3 = new ArrayList<Node>();
        array3.add(new Staff("Eduardo1"));
        array3.add(new Staff("Eduardo2"));
        array3.add(new Staff("Eduardo3"));
        
        ArrayList<Node> array2 = new ArrayList<Node>();
        array2.add(new JobArea(array,"Ventas"));
        array2.add(new Staff("Eduardo"));
        array2.add(new JobArea(array3,"Ventas"));
        
        
        
        Node root = new JobArea(array2 , "Area 1");
        IteratorJobTree iteratorTree = root.createIterator();
        
        while(iteratorTree.hasMore()){
            Node currentNode = iteratorTree.getNext();
            System.out.println(currentNode.getValue());
        }
        
    }
    
}
