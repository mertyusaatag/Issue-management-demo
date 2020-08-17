package com.merty.Dosdemo1.repository;

import com.merty.Dosdemo1.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
