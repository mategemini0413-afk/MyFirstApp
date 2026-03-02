import java.util.ArrayList;
import java.util.List;

/**
 * 게시글 정보를 담는 클래스 (Model)
 */
class Post {
    int id;          // 게시글 번호
    String title;    // 제목
    String content;  // 내용

    // 생성자: 게시글 객체를 만들 때 데이터를 채워줍니다.
    public Post(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // 게시글 정보를 문자열로 반환하는 메서드
    public String toString() {
        return String.format("번호: %d | 제목: %s | 내용: %s", id, title, content);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("=== 자바 게시판 프로그램 (Phase 1) ===");

        // 1. 게시글을 담을 리스트 생성
        List<Post> postList = new ArrayList<>();

        // 2. 임시 데이터 추가 (나중에는 사용자가 직접 입력합니다)
        postList.add(new Post(1, "첫 번째 공지사항", "게시판을 시작합니다."));
        postList.add(new Post(2, "자바 공부 기록", "오늘은 클래스를 배웠어요."));
        postList.add(new Post(3, "GitHub 연동 완료", "소스 관리가 편해졌네요."));

        // 3. 게시글 목록 출력
        System.out.println("--------------------------------------");
        System.out.println("현재 등록된 게시글 수: " + postList.size());
        System.out.println("--------------------------------------");

        for (Post post : postList) {
            System.out.println(post.toString());
        }

        System.out.println("--------------------------------------");
        System.out.println("프로그램 종료");
    }
}