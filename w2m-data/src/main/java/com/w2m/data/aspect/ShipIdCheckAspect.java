package com.w2m.data.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ShipIdCheckAspect {

	private static final Logger log = LoggerFactory.getLogger(ShipIdCheckAspect.class);

	@Before("execution(* com.w2m.model.service.ShipService.getShipById(..)) && args(id)")
	public void beforeGetShipById(final Integer id) {
		if (id != null && id < 0) {
			log.info("Receiving negative identifier getShipById : " + id);
		}
	}

}