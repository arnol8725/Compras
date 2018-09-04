package com.arnol.shopings.servicesImpl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.arnol.shopings.entity.Banco;
import com.arnol.shopings.repository.bancoRepositoryCrud;
import com.arnol.shopings.services.bancoServices;


@Service("bancoServicesImpl")
public class bancoServicesImpl implements bancoServices {
	
	private static final Log LOG = LogFactory.getLog(bancoServicesImpl.class);
	
	@Autowired
	@Qualifier("bancoRepositoryCrud")
	bancoRepositoryCrud bancoRepositoryCru;

	@Override
	public List<Banco> detBanco() {
		// TODO Auto-generated method stub
		/*LOG.info("Detalle");
		LOG.info((List<Banco>) BancoRepositoryCruder.findAll());
		*/
		return (List<Banco>) bancoRepositoryCru.findAll();
	}

}
