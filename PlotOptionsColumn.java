package com.arbol_logika.highcharts;

import java.io.Serializable;

public class PlotOptionsColumn implements Serializable {
    Column column;

    public PlotOptionsColumn(){
       this.column = new Column();
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }


}