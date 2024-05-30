package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    
    @Test
    void shouldReturnAreaOfTwentyWhenLengthIsFourAndBreadthIsFive(){
        Rectangle area = new Rectangle();
        boolean success = area.computeArea(4, 5);
        assertThat(success , equalTo(true));
        int actualArea = area.returnArea();
        int expectedArea = 4*5;
        assertThat(actualArea , equalTo(expectedArea)) ;
    }

    

}
