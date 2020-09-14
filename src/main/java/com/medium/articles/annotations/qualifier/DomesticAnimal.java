package com.medium.articles.annotations.qualifier;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("domesticAnimal")
public class DomesticAnimal implements Animal{
    @Override
    public String getType() {
        return "Animal type is domestic";
    }
}
