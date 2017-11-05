package assignment04;

public class ResonantCircuit{
    private double frequency;
    private double bandwidth;
    private double gain;
    
    public ResonantCircuit(double f, double b, double g){
        frequency = f;
        bandwidth = b;
        gain = g;
    }
    public void display(){
        System.out.println("Resonant Circuit Characteristics: ");
        System.out.println("\tfrequency: " + frequency);
        System.out.println("\tbandwidth: " + bandwidth);
        System.out.println("\tgain: " + gain);
    }
}