public class Twitterizer
{
    /**
     * Shortens and returns long posts by removing vowels
     * @param longPost the post whos vowels need to be removed
     * @return a version of the post without vowels
     */
    public String shorten(String longPost)
    {
        String shortP="";
        for(int i=0;i<longPost.length();i++){
            String letter=longPost.substring(i,i+1);
            if(!"aeiouAEIOU".contains(letter)){
                shortP=shortP+longPost.substring(i,i+1);
            }
        }return shortP;
    }
}
