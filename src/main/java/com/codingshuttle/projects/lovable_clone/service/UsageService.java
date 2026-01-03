package com.codingshuttle.projects.lovable_clone.service;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codingshuttle.projects.lovable_clone.interfaceService.IUsageService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UsageService implements IUsageService {
    @Override
    public UsageTodayResponse getTodayUsageOfUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTodayUsageOfUser'");
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionsLimitsOfUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSubscriptionsLimitsOfUser'");
    }

}
