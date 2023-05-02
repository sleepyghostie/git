package project.scrapper.src.main.java.ru.tinkoff.edu.java.scrapper.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stackoverflow_updates", schema = "link_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StackOverflowUpdates {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "is_answered")
    private boolean isAnswered;
    @Column(name = "answer_count")
    private Integer answerCount;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Link.class)
    @PrimaryKeyJoinColumn
    private Link link;
}
