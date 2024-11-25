package edu.miu.cse.vsms.mapper;

import edu.miu.cse.vsms.dto.request.EmployeeRequestDto;
import edu.miu.cse.vsms.dto.response.EmployeeResponseDto;
import edu.miu.cse.vsms.dto.response.VehicleServiceResponseDto;
import edu.miu.cse.vsms.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMapper {

    public static Employee dtoToEntity(EmployeeRequestDto employeeRequestDto) {
        return new Employee(employeeRequestDto.name(),
                employeeRequestDto.email(),
                employeeRequestDto.phone(),
                employeeRequestDto.hireDate());
    }

    public static EmployeeResponseDto entityToDto(Employee employee) {
        // map service
        List<VehicleServiceResponseDto> vehicleServiceResponseDtos = new ArrayList<>();
        if (employee.getVServices() != null && !employee.getVServices().isEmpty()) {
            vehicleServiceResponseDtos = employee.getVServices().stream()
                    .map(VServiceMapper::entityToDto).toList();
        }
        return new EmployeeResponseDto(employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getPhone(),
                employee.getHireDate(),
                vehicleServiceResponseDtos);
    }
}
