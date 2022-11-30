package Main;

import java.util.Scanner;

import Produtos.IProduto;
import Produtos.Bebidas.IBebidas;
import Produtos.Bebidas.BebidasPreProntas.CocaColaLata;
import Produtos.Bebidas.BebidasPreProntas.GuaranaLata;
import Produtos.Bebidas.Suco.SucoDeLaranja;
import Produtos.Bebidas.Suco.SucoDeManga;
import Produtos.Bebidas.SucoDecorators.SDAcucar;
import Produtos.Bebidas.SucoDecorators.SDAdocante;
import Produtos.Bebidas.SucoDecorators.SDGelo;
import Produtos.Sanduiches.ISanduiche;
import Produtos.Sanduiches.Sanduiche;
import Produtos.Sanduiches.SanduicheDecorators.SDAlface;
import Produtos.Sanduiches.SanduicheDecorators.SDPresunto;
import Produtos.Sanduiches.SanduicheDecorators.SDQueijo;

public class MainProdutos {
    
    public MainProdutos() {
    }

    public IProduto selecionarProduto(Scanner ler){
        System.out.println("Selecione o produto:");
        System.out.println("1-Sanduíche");
        System.out.println("2-Bebida Pronta");
        System.out.println("3-Suco");
        System.out.println("0-Sair");
        int op = ler.nextInt();

        switch (op){
            case 1:
            return montarSanduiche(ler, new Sanduiche());
            case 2:
            return selecionarBebidaPronta(ler);
            case 3:
            return selecionarSuco(ler);
            case 0:
        }
        return null;

    }

    public IProduto selecionarBebidaPronta(Scanner ler){
        System.out.println("Selecione a bebida:");
        System.out.println("1-Coca Cola Lata");
        System.out.println("2-Guaraná Lata");
        System.out.println("0-Sair");
        int op = ler.nextInt();

        switch (op){
            case 1:
            return new CocaColaLata();
            case 2:
            return new GuaranaLata();
            case 0:
        }
        return null;
    }

    public IProduto selecionarSuco(Scanner ler){
        System.out.println("Selecione o suco:");
        System.out.println("1-Manga");
        System.out.println("2-Laranja");
        System.out.println("0-Sair");
        int op = ler.nextInt();

        switch (op){
            case 1:
            return adicionarItensSuco(ler, new SucoDeManga());
            case 2:
            return adicionarItensSuco(ler, new SucoDeLaranja());
            case 0:
        }
        return null;
    }

    public IProduto adicionarItensSuco(Scanner ler, IBebidas suco){
        while(true){
            System.out.println("Itens para adicionar ao suco:");
            System.out.println("1-Gelo");
            System.out.println("2-Açúcar");
            System.out.println("3-Adoçante");
            System.out.println("0-Sair");
            int op = ler.nextInt();

            switch (op){
                case 1:
                suco = new SDGelo(suco);
                break;
                case 2:
                suco = new SDAcucar(suco);
                break;
                case 3:
                suco = new SDAdocante(suco);
                break;
                case 0:
                return suco;
            }
            return suco;
        }
    }

    public IProduto montarSanduiche(Scanner ler, ISanduiche sanduiche){
        while(true){
            System.out.println("Selecione o que colocar no pão:");
            System.out.println("1-Queijo");
            System.out.println("2-Alface");
            System.out.println("3-Presunto");
            System.out.println("0-Sair");
            int op = ler.nextInt();
    
            switch (op){
                case 1:
                sanduiche = new SDQueijo(sanduiche);
                case 2:
                sanduiche = new SDAlface(sanduiche);
                case 3:
                sanduiche = new SDPresunto(sanduiche);
                case 0:
                return sanduiche;
            }
            return sanduiche;
            
        }
    }

}
