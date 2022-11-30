package Produtos.Bebidas.Suco;

public class SucoDeManga extends Suco{

    public SucoDeManga() {
        super("Suco de Manga", 2.00);
    }

    @Override
    protected void preparar() {
        cortarManga();
        System.out.println("Bater manga no liquidificador com água");
    }

    private void cortarManga() {
        System.out.println("Descascar e cortar manga");
    }
    
}
