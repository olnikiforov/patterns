package Homework4.Task2;

public class CustomStringBuilder implements Builder{
    private String str;

    public CustomStringBuilder(String str) {
        this.str = str;
    }

    @Override
    public void appendString(String toAppend) {
        str += toAppend;
    }

    @Override
    public void insertString(int index, String toInsert) {
        char[] chars = str.toCharArray();
        str = "";
        for(int i=0;i< chars.length;i++){
            if(i==index){
                str +=toInsert;
            }
            str+=chars[i];
        }
    }

    @Override
    public String getStr() {
        return str;
    }
}
