package br.com.livraria.model;

public class Ebook extends Livro {

    public Ebook(Autor autor) {
        super(autor);
    }

    private String waterMark;
    
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        System.out.println("Aplicando desconto no EBOOK");
        return super.aplicaDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

}
