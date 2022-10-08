package com.test.task1;

import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

@ToString
@Builder
public class PhoneDto {
    //Создать класс PhoneDto.
    //Подумать какую(ие) аннотацию использовать: builder, superbuilder, noargsconstructor, requiredconstructor,
    //data, value
    //поля: string number - не null, boolean isGovernment, PhoneType phoneType - не null, string clientFio
    //При выводе в String убрать поля isGoverment, phoneType
    @NonNull String number;
    @ToString.Exclude Boolean isGovernment;
    @NonNull @ToString.Exclude
    PhoneType phoneType;
    String clientFio;
}
