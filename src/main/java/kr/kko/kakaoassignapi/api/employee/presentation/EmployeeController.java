package kr.kko.kakaoassignapi.api.employee.presentation;

import kr.kko.kakaoassignapi.api.employee.application.EmployeeService;
import kr.kko.kakaoassignapi.api.employee.dto.EmployeeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public EmployeeResponse findById(@PathVariable final String employeeId) {
        return EmployeeResponse.builder().build();
    }
}