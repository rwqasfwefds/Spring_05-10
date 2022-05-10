package structure.main;

import structure.adapter.Turkey;
import structure.adapter.TurkeyAdapter;
import structure.adapter.WildTurkey;

/**
 * packageName : structure.main
 * fileName : AdapterMain
 * author : ds
 * date : 2022-05-10
 * description : 칠면조 어댑터 테스트
 * 테스트 케이스 1 : 오리 메소드를 호출하면 칠면조 소리가 나는가? O / X
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class AdapterMain {
    public static void main(String[] args) {
//        칠면조 객체 생성
//        다형성 : 느슨한 결합(안에 껍대기는 부모지만 안에 알맹이는 달라질 수 있으니깐,
//        Turkey turkey = new WildTurkey() 이걸 보면 turkey는 Turkey클래스 껍대기지만 실질적인 알맹이는 WildTurkey니깐)
//        부모 Turkey 인터페이스, 클래스 = new 생성자(자식)
//   비교) 단형성 : 단단한 결합(딱 하나만 쓸 수 있잖슴)
//        부모 클래스 = new 부모 생성자()
//        자식 클래스 = new 자식 생성자()
        Turkey turkey = new WildTurkey(); // 들 칠면조

//        칠면조 어댑터 만들기
//        Why? : 오리 메소드를 통해 칠면조 소리를 내게 하기 위해
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        
        turkeyAdapter.quack();; // 오리 메소드지만 칠면조 소리가 남
        turkeyAdapter.fly(); // 칠면조지만 다섯번 날아서 오리처럼 날게 함
        
    }
}
// 어댑터는 다른 인터페이스를 쓰기 위해서 씀
// 클라이언트 소스에 그냥 상속받아도 됨 근데 그렇게 되면 클라이언트 소스가 계속 수정이 일어남
// 그게 ㅈ같은 거임 그래서 중간라인에 어댑터를 끼워서 하는거임
// 최대한 기존의 소스는 안 건들이고 어댑터 같은 걸 추가해서 사용하는거임(하나 건들면 모든 소스를 뒤져서 바뀐 소스를 똑같이 수정 해야되니깐)