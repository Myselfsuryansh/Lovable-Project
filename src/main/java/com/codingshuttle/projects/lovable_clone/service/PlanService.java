package com.codingshuttle.projects.lovable_clone.service;

import java.util.List;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanResponse;

public interface PlanService {

    List<PlanResponse> getAllActiveResponse();

}
