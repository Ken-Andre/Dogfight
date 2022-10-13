package controller;

public class UserOrder implements IUserOrder {
    private int player;
    private Order order;
    public UserOrder(int player,Order order){
        this.player=player;
        this.order=order;
    }
    public Order getOrder(){
        return getOrder();
    }

    public int getPlayer() {
        return player;
    }
}
