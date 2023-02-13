/*
1.Why networking is important
2.The support that Java provides
3.Simple programs to address basic network operations
4.Basic networking terminology
5.A simple server/client application
6.Using a thread to support a server

protocol 하나의 약속. 규칙

tp : 전송 프로토콜

Network addressing using the
InetAddress class

* InetAddress 클래스로 IP 주소를 표시할 수 있음.
여러 사람에게 보내려고 하면 multicast
한 사람에게 보내려고 하면 unicast

퍼블릭 생성자 아예 없고
스태틱 정적 메서드 사용해서 객체 생성을 하겠다.

Channel: This represents a stream of data between applications
Buffer: This works with a channel to process data
Selector: This is a technology that allows a single thread to
handle multiple channels
 */