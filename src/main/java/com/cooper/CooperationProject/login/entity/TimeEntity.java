package com.cooper.CooperationProject.login.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
* ISO 날짜 형식 : 2021-12-02T16:23:47.960583
* T -> 날짜 뒤에 시간 있다는 것을 표시
* 포맷 변경
* LocalDateTime Format 지정 형식 :
* LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"))
* DB 컬럼 데이터 타입
* DATETIME (LocalDateTime) -> DATE (LocalDate) -> VARCHAR (String)
*/
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class TimeEntity {

    @Column(name = "created_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    private String modifiedDate;

    @PrePersist // 해당 엔티티 저장 하기 이전 실행
    public void onPrePersist() {
        this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.modifiedDate = this.createdDate;
    }

    @PreUpdate  // 해당 엔티티 업데이트 이전 실행
    public void onPreUpdate() {
        this.modifiedDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    }
}
