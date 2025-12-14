package com.codingshuttle.projects.lovable_clone.interfaceService;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;

public interface IUsageService {

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionsLimitsOfUser(Long userId);

}
