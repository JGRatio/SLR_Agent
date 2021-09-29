import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SLRAgent extends Agent {
    LinearRegression SLR = new LinearRegression();

    protected void setup() {
        // Create and show the GUI
        GUI myGui = new GUI(this);
        myGui.showGui();
        System.out.println("Hello world! I'm a OneShot Linear Regression agent!");
        System.out.println("My local name is " + getAID().getLocalName());


    }

    public void getX(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {

                System.out.println("Regression model equation:\nY = "+SLR.getB0()+" + "+SLR.getB1()+"X");
                System.out.print("Proyected Value of Y:");
                System.out.print(SLR.getB0()+SLR.getB1()* Integer.parseInt(x));
            }
        });

    }
}
