package ru.kfu.itis.example3.impl;

import ru.kfu.itis.example3.base.MyList;

public class MyListImpl implements MyList {
    private final String[] elements = new String[100];
    private int size = 0;

    @Override
    public void add(String element) {
        elements[size] = element;
        size++;
    }

    @Override
    public void remove(int index) {
        size+=1;
        elements[size] = "";
        for (int i=index;i<=size-1;i++){
            elements[i] = elements[i+1];
        }
        elements[size] = null;
    }

    @Override
    public String get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}