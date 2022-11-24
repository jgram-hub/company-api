package kr.kko.kakaoassignapi.api.department.application;

import kr.kko.kakaoassignapi.api.department.dto.DepartmentOrEmployeeResponse;
import kr.kko.kakaoassignapi.api.department.dto.DepartmentQuery;
import kr.kko.kakaoassignapi.api.department.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public List<DepartmentOrEmployeeResponse> findAllByQueryForTree(DepartmentQuery query) {
        return departmentRepository.findAllByQueryForTree(query);
    }
}