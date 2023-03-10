package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member memebr);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String id);
    List<Member> findAll();
}
