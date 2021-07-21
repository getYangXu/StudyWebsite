package thread.basic.animal;

/**
 * @author yxgu
 */
public class LetOneStop implements Animal.Calltoback {

    /**
     * 动物对象
     */
    Animal an;

    public LetOneStop(Animal an){
        this.an = an;
    }

    @Override
    public void win() {
        //线程停止
        an.stop();
    }
}
