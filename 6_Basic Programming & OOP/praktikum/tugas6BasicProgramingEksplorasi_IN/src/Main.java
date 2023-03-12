class Main {
    private static String encrypt(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    ch = (char) ((ch + 10 - 'A') % 26 + 'A');
                } else {
                    ch = (char) ((ch + 10 - 'a') % 26 + 'a');
                }
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE"));
        System.out.println(encrypt("ALTERRA ACADEMY"));
        System.out.println(encrypt("INDONESIA"));
        System.out.println(encrypt("GOLANG"));
        System.out.println(encrypt("PROGRAMMER"));
    }
}