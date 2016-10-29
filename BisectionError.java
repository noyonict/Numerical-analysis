
public class BisectionError{

    public static void main(String... ar) {
        Error m = new Error();
        double xl = 1.5d;
        double xu = 2d;
        double error = 5;
        double Fxl;
        double Fxu;
        double Fxm;
        double xm = 0;
        double xmOld = 0;
        int i = 0;
        double err = 0;
        do {
            System.out.println("Xl = "+xl);
            System.out.println("Xu = "+xu);
            Fxl = m.functionOf(xl);
            System.out.println("F(xl) = " + Fxl);
            
            Fxu = m.functionOf(xu);
            System.out.println("F(xu) = "+Fxu);
            i++;
            System.out.println("\nIteration " + i);
            xmOld = xm;
            xm = (xl + xu) / 2;
            System.out.println("xm = "+xm);
            //System.out.println("Xm = "+xm);
            if ((Fxl * Fxu) < 0) {
                
                Fxm = m.functionOf(xm);
                System.out.println("F(xm) = "+Fxm);
                if((Fxl*Fxm)<0){
                    xu = xm;
                    
                }else{
                    xl = xm;
                    
                }
                
                if(i>1){
                   err = ((xm - xmOld)*100)/xm;
                    System.out.println("Error = "+err); 
                    if(error>err){
                        break;
                    }
                }
            }else {
                System.out.println("Root not Exist!");
                break;
            }
            
        } while (i<5);

    }

    public double functionOf(double x) {
        double equ = (x * x * x * x) - x - 10;
        return equ;
    }
}
