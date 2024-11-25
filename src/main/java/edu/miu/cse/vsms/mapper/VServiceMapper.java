package edu.miu.cse.vsms.mapper;

import edu.miu.cse.vsms.dto.response.VehicleServiceResponseDto;
import edu.miu.cse.vsms.model.VService;

public class VServiceMapper {

    public static VehicleServiceResponseDto entityToDto(VService vService) {
        return new VehicleServiceResponseDto(vService.getId(),
                vService.getServiceName(),
                vService.getCost(),
                vService.getVehicleType());
    }
}
