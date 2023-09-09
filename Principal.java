import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        double Renda, TipoCasa, SomaRenda = 0;
        int Opc = 0, TotHab = 0,  Hab = 0, Prop = 0, Alug = 0, cont = 0;        
        String mensagem = "1 - Cadastrar residência"
                +"\n2 - Exibir renda média residencial"
                +"\n3 - Quantidade de habitantes"
                +"\n4 - Quantidade de casas próprias e alugadas"
                +"\n0 - Sair";

        do {
            Opc=Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            switch (Opc){
                case 1:
                   cont+=1;
                   Renda = Double.parseDouble(JOptionPane.showInputDialog( "Informe a renda da residência:"));
                   SomaRenda += Renda;
                   Hab = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de pessoas que residem na casa:"));
                   TotHab += Hab;
                   TipoCasa = Double.parseDouble(JOptionPane.showInputDialog("Sua casa é: \n1 -  Própria \n2 - Alugada"));
                   if (TipoCasa==1){
                       Prop++;
                   }
                   else{
                       Alug++;
                    }                  
                break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Renda média: R$" + SomaRenda/cont);
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Números de habitantes: "+ TotHab);
                break;

                case 4:
                JOptionPane.showMessageDialog(null, "Casas alugadas: " + Alug + "\nCasas próprias: " + Prop);                
                break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                break;   

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;                    
            }     
        
        }while(Opc!=0);       
      
    }
    
}