package com.medium.articles.annotations.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("wildAnimal")
public class WildAnimal implements Animal {
    @Override
    public String getType() {
        return "Animal type is wild";
    }
}
