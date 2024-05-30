package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    
    @Test
    void shouldReturnAreaOfTwentyWhenLengthIsFourAndBreadthIsFive(){
        double length = 4.0;
        double breadth = 5.0;
        Rectangle rectangle = new Rectangle(length,  breadth);
        
        double actualArea = rectangle.area();
        assertThat(actualArea, closeTo(20.0,0.1));

        double expectedArea = 20.0;
        assertThat(actualArea, closeTo(expectedArea,0.1));
       
    }

    

}
