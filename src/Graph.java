import Models.NodeG;
import java.util.*;

public class Graph<T> {
    private List<NodeG<T>> nodes;
    private HashSet<NodeG<T>> node;
    public HashSet<NodeG<T>> getNodes(){
        return node;
    }
    
    public Graph() {
        this.node = new HashSet<>();
    }
    
    public void addNode(NodeG<T> node) {

        nodes.add(node);

    }

    public void addConnection(NodeG<T> node1, NodeG<T> node2) {
        node1.addFriend(node2);
        node2.addFriend(node1);
    }

    public List<NodeG<T>> getFriends(NodeG<T> node) {
        return node.getFriends();
    }

    public List<T> recommendFriends(NodeG<T> node) {
      
        return recommendFriends(node);
    }
    public void hashSet(){
       
    }
 

    public void printUserGraph(NodeG<T> node) {
        System.out.println(node.getUser() + " -> " + getFriends(node));
    }
    public void printGraph() {
        for (NodeG<T> node : nodes) {
            System.out.println("Vertex " + node.getUser() + ":");
            for (NodeG<T> friend : node.getFriends()) {
                System.out.println("-> " + friend.getUser());
            }
            System.out.println();
        }
    }
    

}
