import java.util.ArrayList;
import java.util.Random;
/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> words;
    private Random random;
    /**
     * Construtor para objetos da classe WordGenerator
     */
    public WordGenerator()
    {
        words = new ArrayList<>();
        fillArrayList();
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    private void fillArrayList(){
        String palavras[] = {"boolean", "break", "byte", "case", "char", "class", "continue", "do", "double", "else", "enum", "for", "if", "import","int"};
        for(String palavra : palavras){
            words.add(palavra);
        }
    }
    public String generateWord(){
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }
    public void addWord(String word){
        if(words.contains(word)){
            System.out.println("Não foi possível adicionar a palavra");
        }else{
            System.out.println("Palavra adicionada com sucesso");
            words.add(word);
        }
    }
}
