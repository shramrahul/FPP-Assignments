package program1;

import java.util.Arrays;

public class MyTable {
    private static final int ASCII_VALUE_OF_CHARACTER_A=97;
    private Entry[] entries;
    MyTable(){
        entries=new Entry[26];
    }
    //returns the String that is matched with char c in the table
    public String get(char c){
        int index= (int)c-ASCII_VALUE_OF_CHARACTER_A;
        return entries[index].toString();
    }
    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
//implement
        int index= (int)c-ASCII_VALUE_OF_CHARACTER_A;
        entries[index]=new Entry(c,s);
    }
    //returns a String consisting of nicely formatted display
//of the contents of the table
    public String toString() {
//implement
        String str="";
        for(int i=0;i<entries.length;++i){
            if(entries[i]!=null)
            str=str+entries[i].toString()+"\n";
        }
        return str;
    }

    private class Entry {
        private char key;
        private String value;

        Entry(char ch, String str){
            this.key=ch;
            this.value=str;
        }

        public char getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        //returns a String of the form "ch->str"
        public String toString() {

//implement

            return this.getKey()+"->"+this.getValue();
        }
    }
}