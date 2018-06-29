package com.transnal.shiro;

public enum  Shrubbery
{
    GROUND("GROUP DESCRIPTION"),
    CRAWLING("CRAWLING DESCRIPTION"),
    HANGING("HANGING DESCRIPTION");
    private  String description;
    private  Shrubbery(String description){//必须添加自定义的描述方法
        this.description=description;
    }
    public   String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

