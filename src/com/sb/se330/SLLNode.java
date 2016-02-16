package com.sb.se330;

/*
 * Created by Joshua Galbraith on 2/16/2016.
 */

//*********************** SLLNode.java *******************************
public class SLLNode {
    public Object info;
    public SLLNode next;
    public SLLNode() {
        next = null;
    }
    public SLLNode(Object el) {
        info = el; next = null;
    }
    public SLLNode(Object el, SLLNode ptr) {
        info = el; next = ptr;
    }
}

