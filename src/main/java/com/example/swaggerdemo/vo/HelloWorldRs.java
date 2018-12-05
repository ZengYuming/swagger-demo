package com.example.swaggerdemo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "HelloWorldRs", description = "Hello World响应参数")
public class HelloWorldRs implements Serializable {
    public HelloWorldRs() {
    }

    public HelloWorldRs(Double weight, String name, String sn) {
        this.weight = weight;
        this.name = name;
        this.sn = sn;
    }

    @ApiModelProperty("重量")
    private Double weight;
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("SN码")
    private String sn;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }
}
