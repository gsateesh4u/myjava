package com.aexp.test.shape;

public class Square implements BaseShape{
     int edge;

     public Square(int edge){
         this.edge = edge;
     }

    @Override
    public int getArea() {
        return edge*edge;
    }
}
