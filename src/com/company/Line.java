package com.company;

public class Line {
    private int lineNum;
    private String source;
    private String destination;

    public Line(int lineNum, String source, String destination){
        this.lineNum = lineNum;
        this.source = source;
        this.destination = destination;
    }
    public int getLineNum() {
        return lineNum;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public String toString(){
        return "Line " + lineNum + ": " + source + " --> " + destination;
    }
}
