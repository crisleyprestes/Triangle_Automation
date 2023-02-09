package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.BasePage;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class TrianglePage extends BasePage{

    private final String identificarButton = "input[value='Identificar']";
    private final String textTriangleType = "body>div:nth-child(7)";
    private final String value1 = "div:nth-child(4)";
    private final String value2 = "div:nth-child(5)";
    private final String value3 = "div:nth-child(6)";
    private final String triangleDraw = "div:nth-child(7)>img";
    private final String vertice1 = "V1";
    private final String vertice2 = "V2";
    private final String vertice3 = "V3";

    public String getTriangleType(){
        return getText(By.cssSelector(textTriangleType));
    }

    public String getTriangleValues(){
        List<String> values = new ArrayList<String>();
        values.add(getText(By.cssSelector(value1)));
        values.add(getText(By.cssSelector(value2)));
        values.add(getText(By.cssSelector(value3)));

        String listString = ArrayUtils.toString(values.toArray(new String[0]))
                .replaceAll("[{|}]","");

        return listString;
    }

    public boolean isTriangleDrawPresent(){
        return isElementPresent(By.cssSelector(triangleDraw));
    }

    public void setTriangleValues(String value1, String value2, String value3){
        writeOnField(By.name(vertice1), value1);
        writeOnField(By.name(vertice2), value2);
        writeOnField(By.name(vertice3), value3);
        clickOnButton(By.cssSelector(identificarButton));
    }
}

