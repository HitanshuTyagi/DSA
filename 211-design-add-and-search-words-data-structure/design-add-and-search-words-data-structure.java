class WordDictionary {
    Map<Integer,List<String>>map;
    public WordDictionary() {
        map=new HashMap<>();
    }
    
    public void addWord(String word) {
        int len=word.length();
        map.putIfAbsent(len,new ArrayList<>());
        map.get(len).add(word);
    }
    
    public boolean search(String word) {
        int len=word.length();

        if(!map.containsKey(len))return false;

        for(String s:map.get(len)){
            if(match(s,word))return true;
        }
        return false;
    }
    public boolean match(String s,String word){
        for(int i=0;i<s.length();i++){
            if(word.charAt(i)=='.')continue;
            if(s.charAt(i)!=word.charAt(i))return false;
        }
        return true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */