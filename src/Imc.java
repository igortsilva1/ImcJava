public class Imc {
	
	private static float imc;
		
	public static float calcImc(float massa, float altura){
		imc = massa / (altura * altura);
		return imc;
	}
	
	public static String statusImc(float imc){
		String status;
		if(imc < 18.5){
			status = "Abaixo do peso ideal";
		}
		else if(imc <= 24.9){
			status = "Peso normal";
		}
		else if(imc <= 29.9){
			status = "Sobrepeso";
			
		}
		else if(imc <= 39.9){
			status = "Obesidade";
			
		}
		
		else{
			status = "Obesidade morbida";
			
		}
		
		return status;
	}
}
	
