package behavior.main;

import behavior.chainofrepose.Chain;
import behavior.chainofrepose.NegativeProcessor;
import behavior.chainofrepose.Number;
import behavior.chainofrepose.PositiveProcessor;
import behavior.chainofrepose.ZeroProcessor;

/**
 * packageName : behavior.main
 * fileName : ChainOfResponseMain
 * author : ds
 * date : 2022-05-10
 * description : 체인 연쇄 패턴 테스트
 * 테스트 케이스 1 : 조건에 해당하지 않으면 다음 객체로 넘어가는가?
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class ChainOfResponseMain {
    public static void main(String[] args) {
//        객체 생성
        Chain chain = new NegativeProcessor();
        Chain chain2 = new ZeroProcessor();
        Chain chain3 = new PositiveProcessor();
        
//        객체들을 체인으로 연결 : 링크드 리스트로 만들기
//        chain -- chain2 -- chain3
        chain.setNext(chain2);
        chain2.setNext(chain3);
        
//        책임 연쇄 패턴 테스트 : 첫 번째 객체만 호출해도 모두 결과를 찾아주는지 테스트
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
    }
}
