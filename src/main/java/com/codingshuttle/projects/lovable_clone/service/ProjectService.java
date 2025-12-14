package com.codingshuttle.projects.lovable_clone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.project.ProjectRequest;
import com.codingshuttle.projects.lovable_clone.dto.project.ProjectResponse;
import com.codingshuttle.projects.lovable_clone.dto.project.ProjectSummaryResponse;
import com.codingshuttle.projects.lovable_clone.entity.Project;
import com.codingshuttle.projects.lovable_clone.entity.User;
import com.codingshuttle.projects.lovable_clone.interfaceService.IProjectService;
import com.codingshuttle.projects.lovable_clone.mapper.ProjectMapper;
import com.codingshuttle.projects.lovable_clone.repository.ProjectRepository;
import com.codingshuttle.projects.lovable_clone.repository.UserRepository;

import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectService implements IProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

        Project project = Project.builder().name(request.name()).owner(owner).isPublic(false).build();
        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        // return projectRepository.findAllAccessibleByUser(userId)
        //         .stream()
        //         .map(project -> projectMapper.toProjectSummaryResponse(project))
        //         .collect(Collectors.toList());

        var project = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(project);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserProjectById'");
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProject'");
    }

    @Override
    public void softDelete(Long id, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'softDelete'");
    }

}
