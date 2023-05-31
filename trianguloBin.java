package criando_classes_e_objetos;

public class trianguloBin {
	
	double xa;
	double xb;
	double xc;
	double perimetro;
	double area;
	
	    double perimetro() {
		double perimetro = this.xa + this.xb + this.xc;
		return perimetro;
	}
    
	double area() {
		double area = (this.xa + this.xb + this.xc)/ 2;
		return area;
	}
	
	
}
