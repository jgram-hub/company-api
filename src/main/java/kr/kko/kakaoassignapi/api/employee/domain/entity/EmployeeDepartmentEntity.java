package kr.kko.kakaoassignapi.api.employee.domain.entity;

import kr.kko.kakaoassignapi.api.department.domain.code.PositionCode;
import kr.kko.kakaoassignapi.api.employee.application.EmployeeService;
import kr.kko.kakaoassignapi.api.employee.domain.vo.EmployeeDepartmentId;
import kr.kko.kakaoassignapi.core.jpa.entity.BaseEntity;
import kr.kko.kakaoassignapi.core.jpa.entity.CreatedEntity;
import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@ToString
@Entity
@Table(name = "EMPLOYEE_DEPARTMENT")
public class EmployeeDepartmentEntity extends BaseEntity {

    @EmbeddedId
    private EmployeeDepartmentId employeeDepartmentId;

    @Enumerated(EnumType.STRING)
    @Comment("직책코드")
    @Column(name = "POSITION_CODE")
    private PositionCode positionCode;

}