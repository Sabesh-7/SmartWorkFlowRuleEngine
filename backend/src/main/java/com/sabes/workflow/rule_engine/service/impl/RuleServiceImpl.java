package com.sabes.workflow.rule_engine.service.impl;

import com.sabes.workflow.rule_engine.api.dto.RuleCreateRequestDTO;
import com.sabes.workflow.rule_engine.service.RuleService;
import org.springframework.stereotype.Service;
@Service
public class RuleServiceImpl implements RuleService {
    public void createRule(RuleCreateRequestDTO request) {
        System.out.println("Creating rule: " + request.getName());
    }
}
