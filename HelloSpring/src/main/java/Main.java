import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * packageName : PACKAGE_NAME
 * fileName : Main
 * author : ds
 * date : 2022-05-10
 * description : 스프링 프레임웍에서 결과를 출력하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class Main {
    public static void main(String[] args) {
//        1. 스프링 프레임웍에 환경설정 파일을 적용(자바 소스를 넘기는게 아니라 컴파일 된 클래스를 넘김) : 
//        Bean으로 정의 된 메소드가 스프링에 등록이 됨(실질적으로 등록이 되는 부분)
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//        2. 스프링에 등록된 Bean(컴포넌트)에 요청해서 실제 메소드를 호출
//        greeter : 싱글톤(전역객체, 공유객체)(서비스를 등록하면 스프링에서 싱글톤으로 관리를 함 그 말인즉슨 한번 등록해놓으면 계속 쓸 수 있다)
//        greeter이라는 메소드를 가져올거니깐 그대로 이름을 적고 뒤에는 이 greeter메소드가 속해있는 클래스이름을 적어주면 됨(greeter메소드의 반환타입은 Greeter이니깐)
        Greeter greeter = ctx.getBean("greeter", Greeter.class);
//        greeter의 메소드인 getFormat() 호출
        System.out.println(greeter.getFormat());

//        스프링 종료
        ctx.close();
    }
}
