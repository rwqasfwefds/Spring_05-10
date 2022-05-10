package structure.adapter;

/**
 * packageName : structure.adapter
 * fileName : MallardDuck
 * author : ds
 * date : 2022-05-10
 * description : 천둥오리를 구현한(상속한) 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("꽥꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리는 멀리 날 수 있음");
    }
}
