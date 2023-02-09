package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.BaseTest;
import br.com.linhares.crisley.pages.TrianglePage;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest extends BaseTest {

    private TrianglePage trianglePage = new TrianglePage();

    @Test
    public void checkEquilateralTriangle(){
        trianglePage.setTriangleValues("3", "3", "3");
        Assert.assertEquals(trianglePage.getTriangleValues(), "V1 = 3,V2 = 3,V3 = 3");
        Assert.assertTrue(trianglePage.isTriangleDrawPresent());
        Assert.assertEquals(trianglePage.getTriangleType(), "Equilátero");
    }

    @Test
    public void checkIsoscelesTriangle(){
        trianglePage.setTriangleValues("3", "4", "4");
        Assert.assertEquals(trianglePage.getTriangleValues(), "V1 = 3,V2 = 4,V3 = 4");
        Assert.assertTrue(trianglePage.isTriangleDrawPresent());
        Assert.assertEquals(trianglePage.getTriangleType(), "Isósceles");
    }

    @Test
    public void checkScaleneTriangle(){
        trianglePage.setTriangleValues("3", "4", "5");
        Assert.assertEquals(trianglePage.getTriangleValues(), "V1 = 3,V2 = 4,V3 = 5");
        Assert.assertTrue(trianglePage.isTriangleDrawPresent());
        Assert.assertEquals(trianglePage.getTriangleType(), "Escaleno");
    }
}

