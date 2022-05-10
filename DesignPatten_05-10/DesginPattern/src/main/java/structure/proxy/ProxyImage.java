package structure.proxy;

/**
 * packageName : structure.proxy
 * fileName : ProxyImage
 * author : ds
 * date : 2022-05-10
 * description : RealImage 클래스를 대신하는(대리하는) 클래스, RealImage 클래스 인 척 하는 클래스
 *               RealImage 클래스 이름을 숨겨 보안 떡상(클라이언트는 ProxyImage가 돌고있다 생각하지만 실질적으론 RealImage가 돌고있음)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         ds          최초 생성
 */
public class ProxyImage implements Image{
    private String fileName;
    private Image image = null;

//    매개변수 fileName을 가지는 생성자
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
//        image가 부모 인터페이스인데 얘 안에 자식 클래스가 안 들어 와있으면~ 이라는 뜻
        if(image == null){
//            현재 image 객체가 없으면 실제 RealImage를 객체 생성
            this.image = new RealImage(fileName);
        }
//        현재 image 객체가 있으면 이미지 이름 정보 출력
        image.displayImage();
        
    }
}
