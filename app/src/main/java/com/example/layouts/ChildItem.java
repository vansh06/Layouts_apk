package com.example.layouts;


public class ChildItem {

    // Declaration of the variable
    private String ChildItemTitle;
    private String Smalltext;
    private String Img;

    // Constructor of the class
    // to initialize the variable*
    public ChildItem(String childItemTitle,String smalltext,String img)
    {
        this.ChildItemTitle = childItemTitle;
        this.Smalltext = smalltext;
        this.Img = img;
    }

    // Getter and Setter method
    // for the parameter
    public String getSmalltext()
    {
        return Smalltext;
    }
    public String getImg()
    {
        return Img;
    }
    public String getChildItemTitle()
    {
        return ChildItemTitle;
    }

    public void setChildItemTitle(
            String childItemTitle)
    {
        ChildItemTitle = childItemTitle;
    }
    public void setSmalltext(
            String smalltext)
    {
        Smalltext= smalltext;
    }
    public void setImg(
            String img)
    {
        ChildItemTitle = img;
    }
}
