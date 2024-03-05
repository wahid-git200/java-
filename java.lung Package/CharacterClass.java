class CharacterClass{
   public static void main (String[] args) throws Exception{
       Character c='#';
        System.out.println(Character.BYTES);
        Character c1='A';
        System.out.println(Character.isAlphabetic(c));//false
        System.out.println(Character.isAlphabetic(c1));//true
        System.out.println(Character.isLetter(c1)); //true
        System.out.println(Character.isLetter(c));//false
        System.out.println(Character.isLetter(65));//true
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase(56));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase(100));
        System.out.println(Character.toString('a'));
    } 
}