package Models;

import java.util.LinkedList;
import java.util.List;

public class NodeG<T> {
    public T user;
    private List<NodeG<T>> friends;

    public NodeG(T user) {
        this.user = user;
        this.friends = new LinkedList<>();
    }

    public void addFriend(NodeG<T> friend) {
        friends.add(friend);
    }

    public List<NodeG<T>> getFriends() {
        return friends;
    }

    public T getUser() {
        return user;
    }
    public void setUser(T user) {
        this.user = user;
    }
}
