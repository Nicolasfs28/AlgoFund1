import java.util.Scanner;
public class contagem {
    public static void main(String[] args) {
        try (Scanner prompt = new Scanner(System.in)) {
            System.out.println("Informe a quantidades de notas: ");
            int n=prompt.nextInt();
            int nota;
            int contador=0;
            int i=0;
            while(i<n){
                System.out.println("Informe uma nota");
                nota=prompt.nextInt();
                if(nota>=50){
                    contador=contador+1;
            }
            i=i+1;
   }
   System.out.println("Numero de alunos que passaram no exame: " + contador);
        }
}
}