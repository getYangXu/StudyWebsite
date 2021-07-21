package thread.basic.animal;

/**
 * @author yxgu
 */
public class Tortoise extends Animal {

    public Tortoise(){
        setName("乌龟");
    }


    @Override
    public void running() {
        double dis = 0.1;
        length -=  dis;
        if(length <= 0){
            length = 0;
            System.out.println("乌龟获得了胜利");
            //让兔子不要再跑了
            if(calltoback != null){
                calltoback.win();
            }
        }
        System.out.println("乌龟跑了" + dis + "米,距离终点还有" + (int)length + "米");
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
