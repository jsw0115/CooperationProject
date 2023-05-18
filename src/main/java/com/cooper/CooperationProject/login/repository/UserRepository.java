package com.cooper.CooperationProject.login.repository;

import com.cooper.CooperationProject.login.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/*
* static ConcorrentHashMap 사용해 메모리 저장
* -> findByLoginId() : LoginID를 받아 회원 인스턴스 찾는 메서드
* -> Return Type | Optional : loginID 회원 없음
* -> 회원가입 화면 별도로 생성 X -> PostConstruct 사용해 테스트용 회원
*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername (String username);

}
