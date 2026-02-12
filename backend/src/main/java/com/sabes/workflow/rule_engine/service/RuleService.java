package com.sabes.workflow.rule_engine.service;
import com.sabes.workflow.rule_engine.api.dto.RuleCreateRequestDTO;

public interface RuleService {
    void createRule(RuleCreateRequestDTO request);   
}
