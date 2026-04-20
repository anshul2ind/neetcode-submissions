class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordP = 0;
        int abbrP = 0;

        while(abbrP < abbr.length()) {
            if(wordP >= word.length()) {
                return false;
            }
            if(abbr.charAt(abbrP) != word.charAt(wordP)) {
                if(abbr.charAt(abbrP) == '0') {
                    return false;
                } else if(Character.isDigit(abbr.charAt(abbrP))) {
                    String numString = "";
                    int numP = abbrP;
                    while(numP < abbr.length() && Character.isDigit(abbr.charAt(numP))) {
                        numString += abbr.charAt(numP);
                        numP++;
                    }
                    int jumpLength = 0;
                    try {
                        jumpLength = Integer.parseInt(numString);
                    } catch(Exception e) {
                        return false;
                    }

                abbrP = numP;
                wordP += jumpLength;
                } else {
                    return false;
                }

            } else {
                abbrP++;
                wordP++;
            }

            
        }
        return wordP == word.length();
    }
}