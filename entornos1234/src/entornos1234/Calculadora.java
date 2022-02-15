/**
 * 
 */
package entornos1234;

/**
 * @author jose manuel
 *
 */
public class Calculadora {

	public Calculadora(){
        
    }
    /**
     * 
     * @param num1 es la variable1
     * @param num2 es la variable2
     * @return la suma de la variable 1 + la variable 2
     */
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
     * 
     * @param num1 es la variable1
     * @param num2 es la variable2
     * @return la resta de la variable 1 - la variable 2
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    /**
     * 
     * @param num1 es la variable1
     * @param num2 es la variable2
     * @return la multiplicacion de la variable 1 * la variable 2
     */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
     * 
     * @param num1 es la variable1
     * @param num2 es la variable2
     * @return la division de la variable 1 % la variable 2
     */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
