package edu.miu.cse.vsms.controller;

import edu.miu.cse.vsms.dto.request.ServiceRequestDto;
import edu.miu.cse.vsms.dto.response.VehicleServiceResponseDto;
import edu.miu.cse.vsms.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/services")
@RequiredArgsConstructor
public class VehicleServiceController {
    
    private final VehicleService vehicleService;

    // Assign a service to an employee
    @PostMapping
    public ResponseEntity<VehicleServiceResponseDto> assignService(@RequestBody ServiceRequestDto request) {
        // Write your code here
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.assignService(request));
    }
    
}
