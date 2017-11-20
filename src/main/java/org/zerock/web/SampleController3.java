package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		
		// make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		logger.info("doD");
		// Model 클래스는 스프링 MVC에서 기본적으로 제공하는 클래스(뷰에 원하는 데이터를 전달하는 일종 컨테이너)
		model.addAttribute(product);
		
		return "productDetail";
	}
}
