package com.jmh.pattern.adapter.simple;

public class UsbAdapter extends USBLink{

    private TypeCLink typeCLink;

    public UsbAdapter(TypeCLink typeCLink) {
        this.typeCLink = typeCLink;
    }

    @Override
    public void usblink() {
        typeCLink.link();
    }
}
