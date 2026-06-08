class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        Arrays.sort(ransomNoteArray);
        Arrays.sort(magazineArray);

        int count = ransomNoteArray.length;

        int i=0;
        int j=0;
        while(i<ransomNoteArray.length && j<magazineArray.length){
            if(ransomNoteArray[i] == magazineArray[j]){
                i++;
                j++;
                count--;
            }
            else{
                j++;
            }
        }
        if(count == 0){
            return true;
        }
        else{
            return false;
        }
    }
}