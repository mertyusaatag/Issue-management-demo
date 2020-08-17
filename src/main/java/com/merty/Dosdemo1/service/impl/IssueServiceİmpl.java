package com.merty.Dosdemo1.service.impl;

import com.merty.Dosdemo1.dto.IssueDto;
import com.merty.Dosdemo1.entity.Issue;
import com.merty.Dosdemo1.repository.IssueRepository;
import com.merty.Dosdemo1.service.IssueService;
import com.merty.Dosdemo1.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.lang.reflect.Array;
import java.util.Arrays;


public class IssueServiceİmpl implements IssueService {
    private final IssueRepository issueRepository;

    public IssueServiceİmpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }
    private final ModelMapper modelMapper;

    ;

    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate()==null)
        {
            throw new IllegalArgumentException("Tarih bos..");


        }
        Issue issueDb = modelMapper.map(issue,Issue.class);
       issueDb = issueRepository.save(issueDb);
       return modelMapper.map(issueDb,IssueDto.class);

    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page=new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);

        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
};


