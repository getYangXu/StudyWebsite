package thread.basic.station;

/**
 * @author yxgu
 */
public class Test {

    public static void main(String[] args) {

    }

    static void testStation(){
        Station station1 = new Station("窗口1");
        Station station2 = new Station("窗口2");
        Station station3 = new Station("窗口3");

        station1.start();
        station2.start();
        station3.start();
    }
}
