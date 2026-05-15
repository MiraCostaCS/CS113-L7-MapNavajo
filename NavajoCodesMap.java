public class NavajoCodesMap {
    /*** CONSTANT VARIABLES ***/
   //optional 

    /*** INSTANCE VARIABLES ***/
    

    /*** CONSTRUCTOR METHODS ***/
    /**
     * Constructor for the NavajoCodeMap class.
     * Initializes the necessary HashMaps and loads the mappings from the corresponding files.
     */
    public NavajoCodeMap() {
        
    }
    
    
    /*** REQUIRED METHODS ***/
    /**
     * Reads Navajo code mappings from a file and stores them in a HashMap.
     * Assumes each line in the file is formatted as: "Word: NavajoWord"
     * It reads each line, splits it by ": ", and stores the English word and corresponding Navajo code in the navajoMap.
     * @throws Exception If there is an error loading the file.
     */
    private void loadNavajoCodes() {
        //Reads the EnglishToNavajoCodes.txt file
        
        
        //Populates the navajoMap with English-to-Navajo mappings
        
    }
    
    /**
     * Loads the letter-to-word mappings from a file and stores them in the letterToWordMap.
     * Each line in the file is expected to contain a letter followed by a word, separated by ": ".
     * @throws Exception If there is an error loading the file.
     */
    private void loadLetterToWordMap() {
        //Reads the LetterToWordCodes.txt file
        
        //Populates the letterToWordMap with letter-to-Navajo mappings
        
        
    }
    
    /**
     * Loads the reverse mappings from Navajo word to English letter.
     * Each line in the file contains a Navajo word and its corresponding English letter, separated by ": ".
     * This method creates a mapping where each Navajo word is mapped back to the corresponding English letter.
     * @throws Exception If there is an error loading the file.
     */
    private void loadNavajoToWordMap() {
        //Reads the NavajoToEnglishCodes.txt file
        
        //Populates the navajoToWordMap with reverse mappings (Navajo-to-English)
    }
    
    /**
     * Encodes an English phrase into Navajo terms.
     * This method loops through each character of the English phrase, converts it to uppercase,
     * and retrieves the corresponding Navajo code from the letterToWordMap and navajoMap.
     * It handles spaces by separating words with a "/".
     * @param englishText The English text to encode.
     * @return The encoded Navajo message as a string.
     */
    public String encodeToNavajo(String englishText) {
        //Encodes a given English message using the mappings.
        
        //Iterates over each character in the input message.

        //Converts each character to uppercase and looks up the corresponding Navajo word in letterToWordMap.
        
        //Retrieves the corresponding Navajo code from navajoMap and appends it to the result.
        
        //If encountering spaces, handles them appropriately (e.g., adds special characters like /)
        
    }
    
    /**
     * Decodes a Navajo phrase into English terms.
     * This method splits the Navajo message into words and looks up the corresponding English word using the navajoToWordMap.
     * It handles spaces between words by appending a space after each "/" character in the Navajo code.
     * @param navajoText The Navajo text to decode.
     * @return The decoded English message as a string.
     */
    public String decodeToEnglish(String navajoText) {
        //	Decodes a given Navajo message using the reverse mappings.
        
        //Splits the Navajo message into individual words.
        
        //Looks up each Navajo word in the navajoToWordMap to find the corresponding English word.
        
        //Reconstructs the English message and returns it.

        
    }
    
    /**
     * Displays the Navajo code table by printing the English word and its corresponding Navajo code.
     * This method iterates through the navajoMap and prints each key-value pair.
     */
    public void displayNavajoTable() {
        //Prints the contents of the mappings:
            //navajoMap (English to Navajo),

    }
    
    
    /**
     * Displays the letter-to-word mapping table by printing each letter and its corresponding word.
     * This method iterates through the letterToWordMap and prints each key-value pair.
     */
    public void displayLetterToWordTable() {
        //Prints the contents of the mappings:
            //letterToWordMap (Letter to Navajo),
            
    }
    
}
