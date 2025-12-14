package com.codingshuttle.projects.lovable_clone.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingshuttle.projects.lovable_clone.dto.project.FileContentResponse;
import com.codingshuttle.projects.lovable_clone.dto.project.FileNode;
import com.codingshuttle.projects.lovable_clone.interfaceService.IFileService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
@RequiredArgsConstructor
public class FileService implements IFileService{

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileTree'");
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileContent'");
    }

}
