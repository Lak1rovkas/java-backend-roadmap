import java.util.ArrayList;
import java.util.List;

public class SimpleNumbers {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= 100; i++){
            int pointer = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0)
                    pointer++;
            }
            if(pointer == 2)
                list.add(i);
        }
        for(int i : list){
            System.out.println(i);
        }
    }
}
