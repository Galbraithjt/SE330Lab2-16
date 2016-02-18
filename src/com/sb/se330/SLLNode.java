package com.sb.se330;

/*
 * Created by Joshua on 2/16/16.
 */
public class SLLNode
{
    public Object info;
    public SLLNode next;
    public SLLNode()
    {
        next = null;
    }
    public SLLNode(Object el)
    {
        info = el; next = null;
    }
    public SLLNode(Object el, SLLNode ptr)
    {
        info = el; next = ptr;
    }
}
