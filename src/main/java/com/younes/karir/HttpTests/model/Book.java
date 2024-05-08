package com.younes.karir.HttpTests.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "book")
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name ="title",unique = true)
    private String title;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "author_id",
            referencedColumnName = "id"
    )
    private Author author;
}
