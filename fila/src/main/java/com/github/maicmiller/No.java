package com.github.maicmiller;

public class No<T> {

    private T object; // Todos os objetos do java herda desse...
    private No<T> refNo; // referencia do nó.

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
