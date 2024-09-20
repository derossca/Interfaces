public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x){
        String shortWord = (String) x;
        return shortWord.length() < 5;
    }
}
