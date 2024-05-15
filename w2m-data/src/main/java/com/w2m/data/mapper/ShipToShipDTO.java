package com.w2m.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.springframework.core.convert.converter.Converter;

import com.w2m.model.entity.Ship;
import com.w2m.model.openapi.model.ShipDTO;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ShipToShipDTO extends Converter<Ship, ShipDTO> {

}
