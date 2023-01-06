package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private long age;

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Member() {
    }
}

