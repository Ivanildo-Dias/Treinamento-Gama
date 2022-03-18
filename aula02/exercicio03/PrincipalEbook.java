package Aula02.Exercicio03;

public class PrincipalEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Programar em Java", "Deitel", 300);

        System.out.println(ebook.mostrarDados());
        ebook.avancarPagina();
        System.out.println(ebook.getPaginaAtual());
        ebook.voltarPagina();
        ebook.voltarPagina();
        System.out.println(ebook.getPaginaAtual());

        boolean alterou = ebook.irParaPagina(400);
        if (alterou) {
            System.out.println("Foi para a página");
        } else {
            System.out.println("Página inválida");
        }
    }
}
