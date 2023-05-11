package org.kiet.portal.placementPortal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Table(name="Interaction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String FromName;

    @Column(nullable = false)
    private String ToName;

    @Column(nullable = false)
    private String Message;

    @Column(nullable = false)
    private Date MsgDate;

    @Column(nullable = false)
    private int FromToMsg; // if 1 then from student to alumni  && 2 for alumni to student
    @Column(nullable = false)
    private  int soft_delete;
}
