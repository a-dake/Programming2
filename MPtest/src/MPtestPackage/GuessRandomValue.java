/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MPtestPackage;

/**
 *
 * @author Anna
 */
public class GuessRandomValue{
private java.util.Random rndGenerator = new java.util.Random();
private int answer;
public int i;
public final static int NUMBER_OF_VALUES = 10000;
public int numGuesses = 0;
public final int SIZE = 4;
boolean[] array = new boolean [SIZE];


public GuessRandomValue(){
    answer = rndGenerator.nextInt(NUMBER_OF_VALUES);
}
  public void setAnswer(){
      String str = "";
        for ( i=0; i<4; i++){
            char ch = (char)(rndGenerator.nextInt(10) + '0');
            str += ch;
        }
        answer = Integer.parseInt(str);
  }
public void setAnswer(int n){
    if (n <0 || n>=NUMBER_OF_VALUES)
        return;
    answer=n;
}
public int getAnswer(){
    return answer;
}
public int getBigMooCount(int guess){ 
    String answerStr = convertTo(answer);
    int mooCount = 0;
    String guessStr = convertTo(guess);
    for (i = 0; i<4; i++){
        if (guessStr.charAt(i) == answerStr.charAt(i) ){
            array[i] = true;
       mooCount++;
        }
    }
    return mooCount;
}


public int getLittleMooCount(int guess){
    int littleMoos = 0;
        String guessStr = convertTo(guess);
         String answerStr = convertTo(answer);
        boolean usedAnswer[] = new boolean[]{false, false, false, false};
        boolean usedGuess[] = new boolean[]{false, false, false, false};
        
        //eliminate digits used in exact matches
        for(int g = 0; g < 4; g++)
        {
            if(guessStr.charAt(g) == answerStr.charAt(g))
            {
                usedAnswer[g] = true;
                usedGuess[g] = true;
            }
        }
        
        //check for matching digits
        for(int g = 0; g < 4; g++)
        {
            for(int a = 0; a < 4; a++)
            {
                if(!(usedAnswer[a] || usedGuess[g]))
                {
                    if(answerStr.charAt(a) == guessStr.charAt(g))
                    {
                        usedAnswer[a] = true;
                        usedGuess[g] = true;
                        littleMoos++;
                    }//(and) if digits are the same
                }//if neither digit was used
            }//check each digit in answer
        }//check each digit in guess
        
        return littleMoos;
}
    /**int moocount = 0;
    String guessStr = convertTo(guess);
   
    
    for (i = 0; i<4; i++){
      for (int n = 0; n < 4; n++){ 
          while(array[i] != true){
        
           // for(int j = 0; j < SIZE; j++){
   
            if (answerStr.charAt(n) == guessStr.charAt(i)){
                moocount++;
               break;
             }
         }
        
    }
    }
    
    return moocount;
}
*/

public static String convertTo (int guess){
    String guessStr = "" + guess;
    if (guess <10){
        guessStr = "000" + guess;
    }
    else if (guess >10 && guess <100){
        guessStr = "00" + guess;
    }
    else if (guess >100 && guess <1000){
    guessStr = "0" + guess;
}
    
   return guessStr;     
}

public boolean isCorrectGuess(int guess){
 return (guess == answer);
 } 
}





