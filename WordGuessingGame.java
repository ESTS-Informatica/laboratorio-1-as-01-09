
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        this.reader=new InputReader();
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public String getHiddenWord(){
        return hiddenWord;
    }
    public String getGuessedWord(){
        return guessedWord;
    }
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    private void showGuessedWord(){
        System.out.println("Tentativa: "+guessedWord);
    }
    
    public void play(){
        showWelcome();
        while(!guessedWord.equals(hiddenWord)){
            System.out.println("Introduza uma letra");
            char l=reader.getChar(guessedWord);
            guess(l);  
        }
        showResult();
    }
    
    private void showWelcome(){
        System.out.println("Bem-vindo ao jogo");
    }
    private void guess(char letter){
        char[] letters =hiddenWord.toCharArray();
        char[] guessed=guessedWord.toCharArray();
        for(int i =0;i<hiddenWord.length();i++){
            if(letters[i] == letter){
                  guessed[i]=letter;
                  this.guessedWord=String.valueOf(guessed);
            }
        }
        numberOfTries++;
    }
    private void showResult(){
        System.out.println("Número de tentativas: "+numberOfTries);
        System.out.println("Voce acertou a palavra: "+hiddenWord);
    }
}

