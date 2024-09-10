/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
import com.mycompany.mavenproject1.models.Bispo;
import com.mycompany.mavenproject1.models.Cavalo;
import com.mycompany.mavenproject1.models.Peao;
import com.mycompany.mavenproject1.models.Rainha;
/**
 *
 * @author Admin
 */
public class TesteXadrez {
    public static void main (String[] args){
        Bispo bispo = new Bispo();
        bispo.mover();
        
        Cavalo cavalo = new Cavalo();
        cavalo.mover();
        
        Peao peao = new Peao();
        peao.mover();
        
        Rainha rainha = new Rainha();
        rainha.mover();
    }
}
