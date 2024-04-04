package com.example;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.*;

public class FI_from_API {

    public void consumer(){
    Consumer<String> printC = s -> System.out.println(s);
    printC.accept("To be or not to be,that is the question");

    List<String> names = new ArrayList<>();
    names.add("Nirmala");
    names.add("Vairaganthan");
    names.forEach(printC);

    var mapCapitalCities = new HashMap<String, String>();
    BiConsumer<String,String> bicon = (key,value) -> mapCapitalCities.put(key,value);
    bicon.accept("Delhi", "India");
    System.out.println(mapCapitalCities);
    }
    
    public static void main(String[] args) {
        FI_from_API fi = new FI_from_API();
        fi.consumer();
    }

}
