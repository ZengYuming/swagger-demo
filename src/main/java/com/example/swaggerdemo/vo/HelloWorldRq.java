package com.example.swaggerdemo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

@ApiModel(value = "HelloWorldRq", description = "新增HelloWorld的请求参数")
public class HelloWorldRq implements Serializable {

    @ApiModelProperty("唯一标识")
    private Long id;
    /**
     * 文本
     */
    @ApiModelProperty("文本")
    private String text;
    /**
     * 是可用的吗？
     */
    @ApiModelProperty("是可用的吗?")
    private Boolean nice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getNice() {
        return nice;
    }

    public void setNice(Boolean nice) {
        this.nice = nice;
    }
}
