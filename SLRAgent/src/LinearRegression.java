/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio J. Castillo
 */
class LinearRegression {
private double [] x = {23,26,30,34,43,48,52,57,58};
private double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
private double summX, summY, summXY, summX2, B0, B1;
private int n = x.length;
    
public LinearRegression(){
 
  doIt(); 
   
}

    public void setX(double[] x) {
        this.x = x;
        doIt();
    }

    public void setY(double[] y) {
        this.y = y;
        doIt();
    }

    public double getB0() {
        return B0;
    }


    public double getB1() {
        return B1;
    }

    public void doIt(){

    for(int i = 0; i < x.length ; i++ ){
    summX += x[i];
    summY += y[i];
    summXY += x[i] * y[i];
    summX2 += x[i] * x[i];
    }

    B0 = ( (summY * summX2) - (summX * summXY) ) / ( (n * summX2) - (summX * summX) );
    B1 = ( (n * summXY) - (summY * summX) ) / ( (n * summX2) - (summX * summX) );   
   }



}
