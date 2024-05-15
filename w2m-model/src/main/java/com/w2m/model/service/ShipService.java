package com.w2m.model.service;

import java.util.List;

import com.w2m.model.openapi.model.ShipDTO;

public interface ShipService {

	ShipDTO saveShip(ShipDTO ship);

	ShipDTO getShipById(Integer id);

	List<ShipDTO> getAllShips();

	ShipDTO updateShip(ShipDTO ship);

	void deleteShipById(Integer id);

}