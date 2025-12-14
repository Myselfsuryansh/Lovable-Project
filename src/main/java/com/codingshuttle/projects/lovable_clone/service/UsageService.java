package com.codingshuttle.projects.lovable_clone.service;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codingshuttle.projects.lovable_clone.interfaceService.IUsageService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
public class UsageService implements IUsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTodayUsageOfUser'");
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionsLimitsOfUser(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSubscriptionsLimitsOfUser'");
    }

}
