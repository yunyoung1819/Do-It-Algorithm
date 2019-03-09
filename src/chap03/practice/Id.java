package chap03.practice;

/**
 * 아이디를 부여하는 클래스
 *
 * Java 메서드의 종류는 두 가지
 *
 * 인스턴스 메서드 (비정적 메서드)
 * 클래스 메서드 (정적 메서드)
 *
 * 인스턴스 메서드 호출 시 : 클래스형 변수 이름.메서드 이름
 * 클래스 메서드 호출 시 : 클래스 이름.메서드 이름
 *
 */
class Id {
    private static int counter = 0;  // 아이디를 몇 개 부여했는지 저장
    private int id;     // 아이디

    // 생성자
    public Id() {  id = ++counter; }

    // 아이디를 반환하는 인스턴스 메서드
    public int getId() { return id; }

    // counter를 반환하는 클래스 메서드
    public static int getCounter() { return counter; }
}

