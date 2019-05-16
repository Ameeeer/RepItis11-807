package com.company;

import com.company.mystream.MyList;

public class Main {

    public static void main(String[] args) {
//	List<String> integerList = Arrays.asList("1");
//	integerList.stream().map(s -> Integer.valueOf(s)).forEach(System.out::println);
        MyList<String> stringMyList = new MyList<String>();
        stringMyList.add("asdfh");
        stringMyList.add("a");
        stringMyList.add("ad");
        stringMyList.add("gggg");
        stringMyList.stream().filter(s -> s.length()>=2).forEach(s -> System.out.println(s));
    }
}
