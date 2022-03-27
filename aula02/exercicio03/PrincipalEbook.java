package exercicio03;

public class PrincipalEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Programando em Java", "Ivanildo", 500);

        System.out.println(ebook.mostrarDados());
        ebook.avancarPagina();
        ebook.avancarPagina();
        System.out.println(ebook.getPaginaAtual());
        ebook.voltarPagina();
        ebook.voltarPagina();
        System.out.println(ebook.getPaginaAtual());

        boolean alterou = ebook.irParaPagina(700);
        if (alterou) {
            System.out.println("Foi para a página");
        } else {
            System.out.println("Página inválida");
        }
    }
}
