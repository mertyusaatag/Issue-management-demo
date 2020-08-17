package com.merty.Dosdemo1.service;

import com.merty.Dosdemo1.dto.IssueDto;
import com.merty.Dosdemo1.entity.Issue;
import com.merty.Dosdemo1.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {
    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issue);





}
