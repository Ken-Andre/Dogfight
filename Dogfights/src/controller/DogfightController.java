package controller;

import model.IDogfightModel;
import view.IViewSystem;
import model.Missile;

public class DogfightController implements IOrderPerformer{
    private view.IViewSystem viewSystem;
    private model.IDogfightModel dogfightModel;

    private final int TIME_SLEEP=30;
    public  DogfightController(IDogfightModel dogfightModel){
        this.dogfightModel= dogfightModel;
    }
    public void play(){

    }
    public void setViewSystem(IViewSystem viewSystem){
        this.viewSystem= viewSystem;


    }
    private void launchMissile(int player){

    }
    private void gameLoop(){}

    //@Override
    public void orderPerform(UserOrder userOrder) {

    }
}
