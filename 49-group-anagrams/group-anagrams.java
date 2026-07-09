class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String keyword = new String(chars);

            if(!map.containsKey(keyword)){
                map.put(keyword,new ArrayList<>());
            }
            map.get(keyword).add(word);
        }   
        return new ArrayList<>(map.values());
    }
}