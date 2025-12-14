package com.codingshuttle.projects.lovable_clone.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.codingshuttle.projects.lovable_clone.dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.lovable_clone.entity.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(source = "name", target = "projectName")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);
}
