package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{

    //no need to explicitly write constructors, becase it will use its parents constructors

    public DashboardPage(){
            PageFactory.initElements(Driver.get(),this);
        }

    }



