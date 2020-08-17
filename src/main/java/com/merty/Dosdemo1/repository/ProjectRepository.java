package com.merty.Dosdemo1.repository;

import com.merty.Dosdemo1.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    List<Project> getAllByProjectCode (String projectCode);
    List<Project> getByProjectCodeContains (String projectCode);
    Page<Project> findAll (Pageable pageable);
    List<Project> findAll (Sort sort);

}
