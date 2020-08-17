package com.merty.Dosdemo1.repository;

import com.merty.Dosdemo1.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long>
{

}
