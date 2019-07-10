package com.jmh.pattern;

import com.jmh.pattern.adapter.simple.TypeCLink;
import com.jmh.pattern.adapter.simple.UsbAdapter;

public class AdapterTest {


    public static void main(String[] args) {

        UsbAdapter usbAdapter=new UsbAdapter(new TypeCLink());
        usbAdapter.usblink();

    }
}
