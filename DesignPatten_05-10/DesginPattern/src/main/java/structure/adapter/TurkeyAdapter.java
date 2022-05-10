package structure.adapter;

/**
 * packageName : structure.adapter
 * fileName : TurkeyAdapter
 * author : ds
 * date : 2022-05-10
 * description : 오리를 통해서 칠면조의 기능(메소드)을 사용하고 싶을때 어댑터를 이용 함
 *               껍대기 : 오리
 *               알맹이 : 칠면조
 *               클라이언트(고객)는 무조건 오리의 메소드 이름만 사용해야 함
 *               어댑터를 통해 칠면조의 기능을 사용 할 수 있음
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class TurkeyAdapter implements Duck{
//    칠면조를 사용
    Turkey turkey;
    
//    매개변수 1개 생성자 만들기
//    DI : 의존성 주입( 매개변수로 전달 )
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

//    껍대기 : 오리 메소드
//    알맹이 : 칠면조 메소드를 호출 할 거임
    @Override
    public void quack() {
        turkey.gobble(); // 칠면조는 골골 소리 냄
    }

    @Override
    public void fly() {
//        칠면조는 멀리 날지 못하므로 다섯번 날아서 오리처럼
//        긴 거리를 날게 함
        for(int i = 0; i < 5; i++){
            turkey.fly(); // 짧은 거리를 날 수 있음
        }
    }
}
