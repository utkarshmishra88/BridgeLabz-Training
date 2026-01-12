package com.browserbuddy;

class PageNode {
    String url;
    PageNode prev;
    PageNode next;

    public PageNode(String url) {
        this.url = url;
    }
}
