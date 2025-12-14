package com.codingshuttle.projects.lovable_clone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanResponse;
import com.codingshuttle.projects.lovable_clone.interfaceService.IPlanService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
public class PlanService implements IPlanService{

    @Override
    public List<PlanResponse> getAllActiveResponse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllActiveResponse'");
    }

}
