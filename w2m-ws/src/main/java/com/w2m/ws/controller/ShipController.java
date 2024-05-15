package com.w2m.ws.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.w2m.model.openapi.model.ShipDTO;
import com.w2m.model.service.ShipService;
import com.w2m.ws.openapi.api.ShipsApi;

@RestController
public class ShipController implements ShipsApi {

	private final ShipService shipService;

	public ShipController(final ShipService shipService) {
		this.shipService = shipService;
	}

	@Override
	public ResponseEntity<List<ShipDTO>> shipsGet() {

		return ResponseEntity.ok(this.shipService.getAllShips());
	}

	@Override
	public ResponseEntity<Void> shipsIdDelete(final Integer id) {

		this.shipService.deleteShipById(id);
		return ResponseEntity.ok().build();
	}

	@Override
	public ResponseEntity<ShipDTO> shipsIdGet(final Integer id) {

		return ResponseEntity.ok(this.shipService.getShipById(id));
	}

	@Override
	public ResponseEntity<ShipDTO> shipsIdPut(final Integer id, @Valid final ShipDTO shipDTO) {
		// TODO Auto-generated method stub
		return ShipsApi.super.shipsIdPut(id, shipDTO);
	}

	@Override
	public ResponseEntity<ShipDTO> shipsPost(@Valid final ShipDTO shipDTO) {

		return ResponseEntity.ok(this.shipService.saveShip(shipDTO));
	}

}
