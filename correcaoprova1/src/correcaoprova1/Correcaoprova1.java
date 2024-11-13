package correcaoprova1;

import model.Tarefa;
import javax.swing.JOptionPane;

public class Correcaoprova1 {
        
    public static void main(String[] args) {
        Tarefa[] tf = new Tarefa [10];
    
        int op, i=0;
        
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog("1- Add nova tarefa. \n2 - Marcar tarefa como verdadeira. \n3 - Imprimir tarefa \n4- Sair\n Digte a opcao: "));
        
        switch(op){
            case 1:
                tf[i] = new Tarefa();
                tf[i].id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
                tf[i].descricao = JOptionPane.showInputDialog("Digite a descricao: "); 
                tf[i].hinicio = Integer.parseInt(JOptionPane.showInputDialog("Digite hora do inicio: "));
                tf[i].hfim = Integer.parseInt(JOptionPane.showInputDialog("Digite hora do fim: "));
                i++;
                break;
            case 2:
                int pos = -1;
                int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
                for(int j=0;j<10;j++){
                    if(tf[j].id == id){
                        pos=j;
                    }
                }
                int resp = JOptionPane.showConfirmDialog(null,"Deseja marcar tarefa como concluido", "Confirme", JOptionPane.YES_NO_OPTION);
                    
                if(resp == 0){
                    tf[pos].concluido = true;
                    JOptionPane.showMessageDialog(null, "A tarefa foi concluida" + tf[pos].descricao);
                } else {
                    JOptionPane.showMessageDialog(null, "A tarefa continua em aberto" + tf[pos].descricao);
                }
                i++;
                break; 
        
            case 3:
                for(int j=0;j<10;j++){
                    if(tf[j].concluido == false){
                    JOptionPane.showMessageDialog(null, tf[j].descricao);
                    }
                }
                break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Numero invalido", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
        }            
    } while (op != 4);
    }
    
}
