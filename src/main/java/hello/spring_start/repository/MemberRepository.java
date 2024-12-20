package hello.spring_start.repository;

import hello.spring_start.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long Id);
    //Optional : findById가 null일 경우 Optional<T> 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
