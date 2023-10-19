package com.korea.basic1.answer;

import java.time.LocalDateTime;

import com.korea.basic1.question.Question;
import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import com.korea.basic1.user.SiteUser;
import java.util.Set;
import jakarta.persistence.ManyToMany;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;
    @ManyToMany
    Set<SiteUser> voter;





}
