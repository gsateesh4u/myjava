package com.aexp.test.shape;

public class Rectangle implements BaseShape{
     int width;
     int height;

     @Override
     public int getArea() {
          return width * height;
     }
}
