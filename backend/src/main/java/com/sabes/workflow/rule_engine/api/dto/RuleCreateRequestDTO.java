package com.sabes.workflow.rule_engine.api.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
public class RuleCreateRequestDTO {
    @NotBlank
    private String name;
    @NotNull
    @Positive
    private Integer priority;
    @NotBlank
    private String condition;
    @NotBlank
    private String action;
    public RuleCreateRequestDTO() {
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPriority(Integer priority){
        this.priority = priority;
    }
    public Integer getPriority(){
        return this.priority;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public String getCondition(){
        return this.condition;
    }
    public void setAction(String action){
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }
}
