import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : PACKAGE_NAME
 * fileName : AppContext
 * author : ds
 * date : 2022-05-10
 * description : 스프링 환경 설정 자바 클래스
 *               과거에는 xml로 환결 설정 했음, 지금은 자바로 함
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
// @Configuration : 스프링 환경 설정 어노테이션(@)
@Configuration
public class AppContext {

//    @Bean : 스프링 컴포넌트로 등록( 메소드 형태 )
//    @Configuration 이 등록된(걸려있는) 클래스에 나옴
//    컴포넌트 : 스프링에서 관리하는 서비스(메소드, 객체) : 레고 블럭과 같음(재사용 할 것들을 미리 등록해놓고 불러서 씀)
//    컴포넌트 어노테이션의 종류 : @Bean, @Component(좁은개념 : @Service, @Repository)
    @Bean // 이 메소드들을 Bean 어노테이션을 쓰면 스프링에서 관리 함
    public Greeter greeter(){
        Greeter g = new Greeter();
        g.setFormat("Hello Spring"); // 인사말이 저장됨
        return g;
    }
}
