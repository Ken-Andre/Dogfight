package model;

public class Missile<Direction> {
    private final int SPEED=4;
    private final int WIDHT=30;
    private final int HEIGHT=10;
    private final int MAX_DISTANCE_TRAVELED=1400;
    private final String IMAGE= "missile";
    private int distanceTraveled;
    public Missile(Direction direction,Dimension dimension)
    {
        this.direction=direction;
        this.dimension=dimension;
        distanceTraveled = 0;
    }
    public int getWidthWithADirection(Direction direction){
        return 1;
    }
    public int getHeightWithADirection(Direction direction){
        return 1;
    }

}
