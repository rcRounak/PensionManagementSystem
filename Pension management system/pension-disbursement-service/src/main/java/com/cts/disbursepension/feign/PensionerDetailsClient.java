package com.cts.disbursepension.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.disbursepension.model.PensionerDetail;

@FeignClient("PENSIONER-DETAIL-SERVICE")
public interface PensionerDetailsClient {
	/**
	 * method to get pensioner details by aadhaar number
	 * 
	 * @param aadhaarNumber
	 * @return PensionerDetail
	 * 
	 */
	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	PensionerDetail pensionerDetailByAadhaar(@PathVariable String aadhaarNumber);

}
