package com.codingshuttle.projects.lovable_clone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanLimitResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.codingshuttle.projects.lovable_clone.interfaceService.IUsageService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("api/usage")
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsageController {
    IUsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage() {

        return ResponseEntity.ok(usageService.getTodayUsageOfUser());
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits() {

        return ResponseEntity.ok(usageService.getCurrentSubscriptionsLimitsOfUser());
    }
}
