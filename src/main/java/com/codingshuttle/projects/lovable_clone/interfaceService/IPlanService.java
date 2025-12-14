package com.codingshuttle.projects.lovable_clone.interfaceService;

import java.util.List;

import com.codingshuttle.projects.lovable_clone.dto.subscription.PlanResponse;

public interface IPlanService {

    List<PlanResponse> getAllActiveResponse();

}
