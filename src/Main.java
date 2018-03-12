
import java.util.*;

public  class Main {
    public static void main(String[] args) {
        String[] in = new Scanner(System.in).nextLine().split(":");
        LinkedList<String> myList = new LinkedList<String>();
        int max = -1;
        for (int i = 0; i <in.length ; i++) {
            //Индекс нужного элемента находится по значению i-1
            if(in[i].length()==max ){
                myList.add(in[i]);
            }
            if(in[i].length()>max){
                max = in[i].length();
                myList.clear();
                myList.add(in[i]);
            }

        }
        myList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                  if(s1.length() != s2.length())return s1.compareTo(s2);

                else
                    return s1.length() - s2.length();
            }
        });
        for (String s: myList
             ) {
            System.out.println(s);
        }
    }}