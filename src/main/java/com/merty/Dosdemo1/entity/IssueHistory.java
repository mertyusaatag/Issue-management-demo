package com.merty.Dosdemo1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "issue_history")

public class IssueHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @JoinColumn(name = "issue_id")
    private  Issue issue;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(fetch = FetchType.LAZY,optional = true)
    private User asignee;

    @Column(name = "description",length = 500)
    private  String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "details",length = 4000)
    private String details;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private  IssueStatus issueStatus;

}
