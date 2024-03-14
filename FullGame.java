
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FullGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private WordGuessingGame wordGame;
    private InputReader readerX;
    /**
     * Construtor para objetos da classe FullGame
     */
    public FullGame()
    {
        // inicializa variáveis de instância
        this.wordGame = new WordGuessingGame();
        this.readerX = new InputReader();
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void play(){
        
        do{
            
            wordGame.play();
            System.out.println("Deseja continuar a jogar? S/N");
            char l=readerX.getChar("");
            if(l != 'S' && l != 's'){
                System.out.println("Obrigado por jogar!");
                break;
            }
            wordGame.reset();
        }while(true);
            
    }
}

