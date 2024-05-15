package com.w2m.data.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.w2m.data.exception.CustomAppException;
import com.w2m.data.repository.ShipRepository;
import com.w2m.model.entity.Ship;
import com.w2m.model.openapi.model.ShipDTO;
import com.w2m.model.service.ShipService;

@Service
public class ShipServiceImpl implements ShipService {

	private final ShipRepository shipRepository;

	private final ConversionService conversionService;

	@Autowired
	public ShipServiceImpl(final ShipRepository shipRepository, final ConversionService conversionService) {
		this.shipRepository = shipRepository;
		this.conversionService = conversionService;
	}

	@Override
	public ShipDTO saveShip(final ShipDTO shipDTO) {

		Ship ship = this.conversionService.convert(shipDTO, Ship.class);
		ship = this.shipRepository.save(ship);
		return this.conversionService.convert(ship, ShipDTO.class);
	}

	@Cacheable(value = "ships", key = "#id")
	@Override
	public ShipDTO getShipById(final Integer id) {
		final Optional<Ship> shipOptional = this.shipRepository.findById(id);
		final Ship ship = shipOptional.orElseThrow(() -> new CustomAppException("Ship not found for id :: " + id));
		return this.conversionService.convert(ship, ShipDTO.class);
	}

	@Override
	public List<ShipDTO> getAllShips() {

		final List<ShipDTO> lstShipDTO = new ArrayList<>();

		this.shipRepository.findAll().forEach(ship -> {
			lstShipDTO.add(this.conversionService.convert(ship, ShipDTO.class));
		});

		return lstShipDTO;
	}

	@Override
	public ShipDTO updateShip(final ShipDTO ship) {

		final ShipDTO shipDTO = this.getShipById(ship.getId());
		return this.saveShip(shipDTO);
	}

	@Override
	public void deleteShipById(final Integer id) {
		this.shipRepository.deleteById(id);
	}

}