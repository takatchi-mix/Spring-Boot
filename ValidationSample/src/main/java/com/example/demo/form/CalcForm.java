package com.example.demo.form;


import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;



@Data
public class CalcForm {
@NotNull(message= "左: 数値が未入力")
@Range(min=1,max=10,message="左:{min}～｛max｝の数値を入力して")
private Integer leftNum;
@NotNull(message= "右: 数値が未入力")
@Range(min=1,max=10,message="右:{min}～｛max｝の数値を入力して")
private Integer rightNum;
}
