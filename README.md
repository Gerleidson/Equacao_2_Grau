Um professor de matemática pede a você que ajude a criar um programa que auxilie na resolução das operações em equação do segundo grau completas. Para isso ele pede que você crie um programa em que os alunos informem os 3 valores e o programa calcule a equação de segundo grau. O professor espera que o aluno tenha um entendimento claro do que está sendo solicitado e para isso ele quer que o programa solicite as variáveis da seguinte forma:

Etapa 1 
Informe o valor de ‘a’
Informe o valor de ‘b’
Informe o valor de ‘c’

Etapa 2
E como resposta, após o cálculo ele espera que o programa responda:
O valor de delta é: ??????
O valor de x1 é: ??????
O valor de x2 é: ??????

Agora se o delta for negativo ele espera a seguinte resposta:
O valor de delta é: ??????
Não existem raízes reais.
 
Para esta atividade mapa você pode utilizar a função Math.pow(x,2) para elevar a variável ‘x’ ao quadrado, e a função Math.sqrt(x) para calcular a raiz quadrada de ‘x’. Se utilizar outras variáveis é só substituir a variável x pela sua correspondente. Importante é que você deve utilizar exceção para quando não existir uma raiz real usando o seguinte método estático para cálculo do delta

    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    }

Lembrando que o cálculo do x1 e x2 pode ser realizado pelas fórmulas:
double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);
