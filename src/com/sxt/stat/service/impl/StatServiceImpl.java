package com.sxt.stat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxt.stat.domain.BaseEntity;
import com.sxt.stat.mapper.StatMapper;
import com.sxt.stat.service.StatService;

@Service
public class StatServiceImpl implements StatService {
	
	
	@Autowired
	private StatMapper statMapper;

	@Override
	public List<BaseEntity> loadCustomerAreaStatList() {
		return statMapper.queryCustomerAreaStat();
	}

	@Override
	public List<BaseEntity> loadOpernameYearGradeStatList(String year) {
		return this.statMapper.queryOpernameYearGradeStat(year);
	}

	@Override
	public List<Double> loadCompanyYearGradeStatList(String year) {
		return this.statMapper.queryCompanyYearGradeStat(year);
	}

}
