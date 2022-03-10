import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        float valora = input.nextFloat();
        System.out.print("Informe o valor de B: ");
        float valorb = input.nextFloat();
        System.out.print("Informe o valor de C: ");
        float valorc = input.nextFloat();

        float delta = valorb * valorb - 4 * valora * valorc;  

        if(delta > 0){
            double calraiz = Math.sqrt(delta);
            float raiz = (float)calraiz;
            
            float x1 = (- valorb + raiz) / (2 * valora);
            float x2 = (- valorb - raiz) / (2 * valora);
    
            System.out.println("O valor do DELTA é: "+delta);
            
            System.out.format("S {%.4f}, {%.4f}\n", x1, x2);

        }else if(delta == 0){
            double calraiz = Math.sqrt(delta);
            float raiz = (float)calraiz;
            
            float x1 = (- valorb + raiz) / (2 * valora);
            float x2 = (- valorb - raiz) / (2 * valora);
    
            System.out.println("O valor do DELTA é: "+delta);
            System.out.format("S {%.4f}, {%.4f}\n", x1, x2);

        }else{
            System.out.println("O valor do DELTA é: "+delta);
            System.out.println("A equação não possui valores reais. ");
        }


        input.close();
    }
}
