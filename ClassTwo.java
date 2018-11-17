public class ClassTwo {
    private String s1;
    private String s2;
    ClassTwo(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public String add(){
        return s1 + s2;
    }
    public String reverse(String s){
        String f = "";
        for(int i=s.length() - 1;i>=0;i--){
            f += s.charAt(i);
        }
        return f;
    }
}