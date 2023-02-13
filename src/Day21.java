import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day21 {
    public static void main(String[] args) {
        // 예외처리
        try {
            InetAddress addr = InetAddress.getByName("www.inha.ac.kr");
            // new 없이 어떻게 이 생성자가 만들어진거지? => 내부적으로 private 메서드가 다 돌고 있다.
            System.out.println(addr);

            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getHostName());
        }
        // 예외: 존재하지않는 URL
        catch (UnknownHostException e) {
            //throw new RuntimeException(e);
            System.out.println("해당 URL은 존재하지 않습니다.");
        }

    }
}
