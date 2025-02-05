
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
    private WordGenerator wordG;
    /**
     * Construtor para objetos da classe WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.reader=new InputReader();
        this.wordG = new WordGenerator();
        this.hiddenWord = wordG.generateWord();
        this.guessedWord= guessedWord;
        this.numberOfTries = 0;
        
    
        
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
    public void setGuessedWord(String guessedWord){
        this.guessedWord = guessedWord;
    }
    
    private void showGuessedWord(){
        System.out.println("Tentativa: "+guessedWord);
    }
    
    public void play(){
        showWelcome();
        hiddenWord = wordG.generateWord();
        initializeGuessedWord();
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
    private void initializeGuessedWord(){
        char[] guessedA = new char[hiddenWord.length()];
        for(int i=0;i<hiddenWord.length();i++){
            guessedA[i] = '_';
        }
        setGuessedWord(new String(guessedA));
    }
    public void reset(){
        numberOfTries = 0;
        hiddenWord = wordG.generateWord();
        initializeGuessedWord();
    }
}

