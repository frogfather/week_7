package com.example.user.wordcount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 13/12/2016.
 */
public class Wordcount {
    private HashMap myHash;
    private String[] myArray;

    public Wordcount(){
        this.myHash = new HashMap();
    }

    public void splitString(String inputString){
        myArray = inputString.split(" ");
    }

    public String[] getArray(){
        return this.myArray;
    }

    public void makeHashMap(String[] inputArray){
        if (inputArray.length > 0){
            for (int i=0; i< inputArray.length;i++){
                String theWord = inputArray[i];
                if (this.myHash.containsKey(theWord)){
                    int freq = (int) this.myHash.get(theWord);
                    freq++;
                    this.myHash.put(theWord,freq);
                }
                else {
                    int freq = 1;
                    this.myHash.put(theWord,freq);
                }
            }

        }
    }

    public String getWordDistribution(){
        String resultString = "";
        if (!this.myHash.isEmpty()){
            Set set = myHash.entrySet();
            Iterator i = set.iterator();
            while (i.hasNext()){
                Map.Entry me = (Map.Entry)i.next();
                resultString += me.getKey()+": "+me.getValue()+" ";
            }
        }
        return resultString;
    }
}
