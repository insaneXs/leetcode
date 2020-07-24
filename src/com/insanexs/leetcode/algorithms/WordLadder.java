package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName WordLadder
 * @Description Word Ladder #127 (Medium)
 * @Author insaneXs
 * @Date 2020/7/24
 */
public class WordLadder {
    //TIME LIMIT EXCEEDED
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//        if(wordList == null || wordList.size() == 0){
//            return 0;
//        }
//        boolean[] visited = new boolean[wordList.size()];
//        int ret = visited.length + 1;
//        for(int i=0; i<wordList.size(); i++){
//            if(oneCharChanged(beginWord, wordList.get(i))){
//                if(endWord.equals(wordList.get(i))){
//                    continue;
//                }else{
//                    visited[i] = true;
//                    int tmp = doSearch(wordList.get(i), endWord, wordList, visited, 1);
//                    visited[i] = false;
//                    if(tmp != 0 && tmp < ret){
//                        ret = tmp;
//                    }
//                }
//            }
//        }
//        return ret == visited.length + 1 ? 0 : ret;
//    }
//
//    private int doSearch(String beginWord, String endWord, List<String> wordList, boolean[] visited, int count){
//        if(beginWord.equals(endWord)){
//            return count + 1;
//        }else if(count == visited.length){
//            return 0;
//        }
//
//        int ret = visited.length + 1;
//        for(int i=0; i<wordList.size(); i++){
//            if(!visited[i] && oneCharChanged(wordList.get(i), beginWord)){
//                visited[i] = true;
//                int tmp = doSearch(wordList.get(i), endWord, wordList, visited, count + 1);
//                visited[i] = false;
//                if(tmp != 0 && tmp < ret){
//                    ret = tmp;
//                }
//            }
//
//        }
//        return ret;
//    }

    private boolean oneCharChanged(String str1, String str2){
        int diffNum = 0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                diffNum++;
            }
            if(diffNum > 1){
                break;
            }
        }
        return diffNum == 1;
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList == null || wordList.size() == 0){
            return 0;
        }
        boolean[] visited = new boolean[wordList.size()];
        return searchByBSF(Arrays.asList(beginWord), endWord, wordList, visited, 1);

    }

    private int searchByBSF(List<String> candidates, String endWord, List<String> wordList, boolean[] visited, int count){
        System.out.println(candidates);

        List<String> newCandidates = new ArrayList<>();
        for(int i=0; i<candidates.size(); i++){
            if(candidates.get(i).equals(endWord)){
                return count;
            }
            for(int j=0; j<wordList.size(); j++){
                if(!visited[j] && oneCharChanged(candidates.get(i), wordList.get(j))){
                    visited[j] = true;
                    newCandidates.add(wordList.get(j));
                }
            }
        }

        if(newCandidates.size() > 0){
            return searchByBSF(newCandidates, endWord, wordList, visited, count + 1);
        }else{
            return 0;
        }
    }


    public static void main(String[] args){
        String beginWord = "cq";
        String endWord = "qa";

        List<String> wordList = Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye");

        //List<String> wordList = Arrays.asList("cog");
        System.out.println(new WordLadder().ladderLength(beginWord, endWord, wordList));
    }

}
