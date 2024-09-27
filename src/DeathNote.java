import java.util.Scanner;

public class DeathNote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 10; // Defina o número total de perguntas

        System.out.println("******");
        System.out.println("*   FACULDADE ALFREDO NASSER   *");
        System.out.println("******");
        System.out.println("*   Aluno: Pedro Henrique Alves Lisita  *");
        System.out.println("*  Professor: Brenno Pimenta da Costa  *");
        System.out.println("******");
        System.out.println("*   Quiz de 15 perguntas de Death Note *");
        System.out.println("******");

        System.out.println("Olá, bem-vindo ao Quiz sobre o anime Death Note!");

        // Pergunta 1
        System.out.println("Pergunta 1: Qual é o verdadeiro nome de Kira?");
        System.out.println("a) Kira");
        System.out.println("b) Ryuk");
        System.out.println("c) Teru Mikami");
        System.out.println("d) Misa Amane");
        System.out.println("e) Light Yagami");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("e")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é:e) Light Yagami");
        }

        // Pergunta 2
        System.out.println("Pergunta 2: Quem é o Shinigami que acompanha Light Yagami?");
        System.out.println("a) Kira");
        System.out.println("b) L");
        System.out.println("c) Ryuk");
        System.out.println("d) Rem");
        System.out.println("e) Jizo");
        System.out.print("Sua resposta: ");
        String resposta2 = scanner.nextLine();

        if (resposta2.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: c) Ryuk");
        }

        // Pergunta 3
        System.out.println("Pergunta 3: Qual é a condição necessária para que alguém morra ao escrever seu nome no Death Note?");
        System.out.println("a) Saber o nome e conhecer o rosto da pessoa");
        System.out.println("b) Escrever o nome");
        System.out.println("c) Ser Shinigami");
        System.out.println("d) Conhecer o rosto");
        System.out.println("e) Encostar no caderno");
        System.out.print("Sua resposta: ");
        String resposta3 = scanner.nextLine();

        if (resposta3.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: a) Saber o nome e conhecer o rosto da pessoa");
        }

        // Pergunta 4
        System.out.println("Pergunta 4: Qual é o objetivo inicial de Light ao usar o Death Note?");
        System.out.println("a) Vingar a morte de sua mãe");
        System.out.println("b) Tornar-se o Deus do Novo Mundo");
        System.out.println("c) Testar os limites do caderno");
        System.out.println("d) Proteger seus amigos");
        System.out.println("e) Criar um mundo sem crimes");
        System.out.print("Sua resposta: ");
        String resposta4 = scanner.nextLine();

        if (resposta4.equalsIgnoreCase("e")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: e)Criar um mundo sem crimes ");
        }
        // Pergunta 5
        System.out.println("Pergunta 5: Quem é o detetive que se torna o próximo L?");
        System.out.println("a) Mello");
        System.out.println("b) Kira");
        System.out.println("c) Matsuda");
        System.out.println("d) Theo");
        System.out.println("e) Near");
        System.out.print("Sua resposta: ");
        String resposta5 = scanner.nextLine();

        if (resposta5.equalsIgnoreCase("e")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: e) Near");
        }
        System.out.println("Pergunta 6:O que acontece quando um Shinigami escreve o nome de um ser humano? ");
        System.out.println("a) Perde as memórias");
        System.out.println("b) Perde os poderes");
        System.out.println("c) Eles morrem ");
        System.out.println("d) Se tornam humanos");
        System.out.println("e) Recebem um novo caderno");
        System.out.print("Sua resposta: ");
        String resposta6 = scanner.nextLine();

        if (resposta6.equalsIgnoreCase("c")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: c) Eles morrem ");

    }
        System.out.println("Pergunta 7: Quem mata o L? ");
        System.out.println("a) Rem");
        System.out.println("b) Misa Amane");
        System.out.println("c) Kira ");
        System.out.println("d) Ryuk");
        System.out.println("e) Ele mesmo ");
        System.out.print("Sua resposta: ");
    String resposta7 = scanner.nextLine();

        if (resposta7.equalsIgnoreCase("a")) {
        System.out.println("Resposta correta!");
        score++;
    } else {
        System.out.println("Resposta errada! A resposta correta é: a) Rem ");
    }
        System.out.println("Pergunta 8: O que acontece quando um humano faz o Acordo dos Olhos de Shinigami? ");
        System.out.println("a) Ganha a imortalidade");
        System.out.println("b) Perde metade da sua vida");
        System.out.println("c) Pode ver o futuro ");
        System.out.println("d) Consegue ver o nome das outras pessoas, porém perde metade do seu tempo de vida");
        System.out.println("e) Ganha outro caderno ");
        System.out.print("Sua resposta: ");
        String resposta8 = scanner.nextLine();

        if (resposta8.equalsIgnoreCase("d")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: d) Consegue ver o nome das outras pessoas, porém perde metade do seu tempo de vida ");
        }
        System.out.println("Pergunta 9: Como Light Yagami esconde o Death Note em seu quarto? ");
        System.out.println("a) Em um cofre em seu quarto");
        System.out.println("b) Em uma gaveta com um macanismo explosivo");
        System.out.println("c) Debaixo da cama ");
        System.out.println("d)  Dentro de seu livro de estudos");
        System.out.println("e) Ele não esconde ");
        System.out.print("Sua resposta: ");
        String resposta9 = scanner.nextLine();

        if (resposta9.equalsIgnoreCase("b")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é: b) Em uma gaveta com um macanismo explosivo ");
        }
        System.out.println("Pergunta 10: Qual o nome do L? ");
        System.out.println("a) Lawliet");
        System.out.println("b) Light");
        System.out.println("c) Nate river ");
        System.out.println("d)  Mello");
        System.out.println("e) Yotsuba ");
        System.out.print("Sua resposta: ");
        String resposta10 = scanner.nextLine();

        if (resposta10.equalsIgnoreCase("a")) {
            System.out.println("Resposta correta!");
            score++;
        } else {
            System.out.println("Resposta errada! A resposta correta é:a) Lawliet ");
        }


        // Mostra o resultado final
        System.out.println("******");
        System.out.println("Você acertou " + score + " de " + totalQuestions + " perguntas.");
        double porcentagemAcertos = (double) score / totalQuestions * 100;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);

        scanner.close();
    }
}