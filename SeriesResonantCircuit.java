package assignment04;

public class SeriesResonantCircuit extends ResonantCircuit{
    private double resistance;
    private double capacitance;
    private double inductance;
    
    public SeriesResonantCircuit(double r, double c, double L){
        super(computeFrequency(c,L), computeBandwidth(r,L), 1/r);
        resistance = r;
        capacitance = c;
        inductance = L;
    }
    static private double computeBandwidth(double r, double L){
        if(r==0 || L==0){
            throw new IllegalArgumentException("inputs cannot be zero");
        }
        return (r/L);
    }
    
    static private double computeFrequency(double c, double L){
        if(c==0 || L==0){
            throw new IllegalArgumentException("inputs cannot be zero");
        }
        return Math.sqrt(1/(c * L));
    }
    
    public void display(){
        super.display();
        System.out.println("\tresistance: " + resistance);
        System.out.println("\tcapacitance: " + capacitance);
        System.out.println("\tinductance: " + inductance);
    }
    
}