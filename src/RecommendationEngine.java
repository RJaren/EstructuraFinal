
import Models.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RecommendationEngine {
    public List<User> recommendFriends(NodeG<User> node, Graph<User> graph){
        List<User> recomendList = new ArrayList<>();
        for(NodeG<User> potentialFriendNode : graph.getNodes()){
        User potentialFriend = potentialFriendNode.getUser();
        if(!node.getFriends().contains(potentialFriendNode) && !node.getUser().equals(potentialFriend) ){
            double similary = calculateSimilarity(node.getUser() , potentialFriend);
            if(similary > 0.5 ) {
                recomendList.add(potentialFriend);
            }

        }
    }
    return recomendList;
}
    private double calculateSimilarity(User user1, User user2) {
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double resp = (double) intersection.size() / union.size();
        System.out.println("Valor- " + resp);
        return resp;
    }
}
