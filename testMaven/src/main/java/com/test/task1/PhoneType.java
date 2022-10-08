package com.test.task1;

import lombok.ToString;
import lombok.Value;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@ToString
@Value
@RequiredArgsConstructor
public class PhoneType {
    //Задача №1
    //Создать класс PhoneType, сделать поля неизменяемыми. Все поля должны быть не null.
    //Подумать какую(ие) аннотацию использовать: builder, superbuilder, noargsconstructor, requiredconstructor,
    //data, value
    //поля: string name, string code, boolean isMobile
    //При выводе в String убрать поле isMobile
    @NonNull String name;
    @NonNull String code;
    @NonNull @ToString.Exclude Boolean isMobile;
}
