package servlet.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.psl.dataaccess.util.EgovMap;
import servlet.service.ServletService;

@Service("ServletService")
public class ServletImpl extends EgovAbstractServiceImpl implements ServletService{
	
	@Resource(name="ServletDAO")
	private ServletDAO servletDao;

	@Resource(name="LayerDAO")
	private LayerDAO layerDao;
	
	@Override
	public String addStringTest(String str) throws Exception {
		List<EgovMap> mediaType = servletDao.selectAll();
		return str + " -> testImpl ";
	}
	
}
