package com.sabes.workflow.rule_engine.api.controller;

import com.sabes.workflow.rule_engine.api.dto.RuleCreateRequestDTO;
import com.sabes.workflow.rule_engine.api.dto.RuleResponseDTO;
import jakarta.validation.Valid;
import com.sabes.workflow.rule_engine.service.RuleService;
import org.apache.tomcat.util.digester.Rule;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rules")
public class RuleController {
    private final RuleService ruleService;
    public RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createRule(@Valid @RequestBody RuleCreateRequestDTO ruleCreateRequestDTO) {
        ruleService.createRule(ruleCreateRequestDTO);
        return "Rule created successfully";
    }
}
