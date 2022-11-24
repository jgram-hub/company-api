package kr.kko.kakaoassignapi.api.department.domain.entity;

import kr.kko.kakaoassignapi.api.department.domain.code.PositionCode;
import kr.kko.kakaoassignapi.api.department.domain.vo.DepartmentEmployeeHistoryId;
import kr.kko.kakaoassignapi.api.department.domain.vo.DepartmentEmployeeId;
import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@ToString
@Entity
@Table(name = "DEPARTMENT_EMPLOYEE_HISTORY")
public class DepartmentEmployeeHistoryEntity {

    @EmbeddedId
    private DepartmentEmployeeHistoryId departmentEmployeeHistoryId;

    @Enumerated(EnumType.STRING)
    @Comment("직책코드")
    @Column(name = "POSITION_CODE")
    private PositionCode positionCode;

}