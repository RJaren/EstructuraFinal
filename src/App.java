import java.util.Arrays;

import Models.NodeG;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Graph<User> graph = new Graph<>();

        // Crear usuarios
        User user1 = new User("Alice", 30, Arrays.asList("Music", "Art","Movies"));
        User user2 = new User("Bob", 25, Arrays.asList("Music", "Sports"));
        User user3 = new User("Charlie", 35, Arrays.asList("Art", "Movies"));
        User user4 = new User("Dave", 40, Arrays.asList("Sports", "Travel"));
        User user5 = new User("Eve", 28, Arrays.asList("Music", "Movies"));

        // Crear nodos
        NodeG<User> node1 = new NodeG<>(user1);
        NodeG<User> node2 = new NodeG<>(user2);
        NodeG<User> node3 = new NodeG<>(user3);
        NodeG<User> node4 = new NodeG<>(user4);
        NodeG<User> node5 = new NodeG<>(user5);

        // Añadir nodos al grafo
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        // Añadir conexiones
        graph.addConnection(node1, node2);
        graph.addConnection(node1, node3);
        graph.addConnection(node2, node4);
        graph.addConnection(node2, node3);
        graph.addConnection(node3, node5);

        graph.printGraph();
        System.out.println();
        RecommendationEngine engine = new RecommendationEngine();
        List<User> recomendList = engine.recommendFriends(node1, graph);
        System.out.println("Friend recommendations for " + user1.getName() + ": " + recomendList);

    }
}
